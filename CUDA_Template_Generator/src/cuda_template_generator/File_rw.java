/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuda_template_generator;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 *
 * @author Pavel
 *    CUDA template generator - program creates source file template for GPGPU application
    Copyright (C) 2011  Pavel Kartashev

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class File_rw {

    
   private ArrayList<Array_def> array;
    private kernel_param ker;
    
    public File_rw(ArrayList<Array_def> array, kernel_param ker) {
     //   System.out.print("123");
                
  //  file_name = file1;
  //  this.content = content;
        this.array = array;
        this.ker = ker;
        write_kernel(ker);
       write_function();
       // write("wer", "sdf");
        
    
}
    
    void write_function() {
    String out="#include <cuda.h>\n"
            + "#include <cutil_inline.h>\n"
            + "#include <stdlib.h>\n"
            + "#include "+'"'+"block_thread.h"+'"'+"\n"
            + "#include <stdio.h>\n"
            + "#include <string.h>\n"
            + "#include <math.h>\n"
            + "#include <omp.h>\n"
            + "#include <kernel.cu>\n"
            +"//uncomment if you want to make function external\n"
            + "//extern " +'"' +"C" + '"' +"\n";
    
    out+="void RunGPU("+ k_arg(array,"cpu")+ ") {\n"
            + "int block=0; int thread=0;\n"
    + init_gpu(array)   
            + memory_copy(true, array) +
            compute_gpu() +
            memory_copy(false, array)
+ free_gpu(array)
                        
            
            
            
                        + "}\n";
    write("gpgpu_f.cu",out);
    
    }
    String free_gpu(ArrayList<Array_def> array) {
      String out="";
        for (int i=0;i<array.size();i++) {
           if(array.get(i).isarr) out+="cutilSafeCall(cudaFree(gpu"+i+"));\n";
            if (array.get(i).allocated)  out+="cutilSafeCall(cudaFree(hcpu"+i+"));\n";
        }
        return out;
        }
    String compute_gpu() {
    String out="";
    if (ker.manual_block) {
    out+="thread=" +ker.thread +";\n" + "block=" + ker.block +";\n";
    out+="kernel<<< block,thread >>>("+k_arg(array,"gpu")+");\n";
    } else {
    out+="block_thread2(block,size,thread);\n";
    out+="kernel<<< block,thread >>>("+k_arg2(array,"gpu")+");\n"; }
    return out;
    }
    
    String memory_copy(boolean in,ArrayList<Array_def> array)   {
        String out="";
        for (int i=0;i<array.size();i++) {
            if (array.get(i).isarr)
        if (in) { if (array.get(i).I) {
            out+="cutilSafeCall( cudaMemcpy";
            if (!array.get(i).sync) {out+= "Async";}
            out+="( gpu"+i+", ";
                     if (!array.get(i).allocated) out+="cpu";
                     else
                         out+="hcpu";
                            out+=i+", size"+i+",cudaMemcpyHostToDevice";
              if (!array.get(i).sync)out      += ",0";
                    out+= ") );\n";
        } } else {if (array.get(i).O) {
           out+="cutilSafeCall( cudaMemcpy";
           if (!array.get(i).sync) {out+= "Async";}
           out+= "( cpu"+i+", gpu"+i+", size"+i+",cudaMemcpyDeviceToHost";
                  if (!array.get(i).sync)out      += ",0";
                    out+= ") );\n";
        }}
        }
        return out;
    }
    
    String init_gpu(ArrayList<Array_def> array) {
        int s_num=ker.array_p;
    String out="";
    out += "int size = "+ "size"+s_num+ " / sizeof("+array.get(s_num).type+");\n";
    for (int i=0;i<array.size();i++) { if (array.get(i).isarr)
        if (array.get(i).allocated) {
         out+=array.get(i).type+ "*"+ "hcpu" +i+";\n";
         out+="CUDA_SAFE_CALL( cudaHostAlloc(&hcpu"+i+", size"+i+",cudaHostAllocDefault) );\n";    
         out+="cutilSafeCall( cudaMemcpy( hcpu"+i+", cpu"+i+", size"+i+",cudaMemcpyHostToHost) );\n";
        };
       if (array.get(i).isarr) {  out+=array.get(i).type+ "*"+ "gpu" +i+";\n"
               // +"int size_a"+i+"sizeof("+array.get(i).type+") * size;"
                +"CUDA_SAFE_CALL( cudaMalloc(&gpu"+i+", size"+i+") );\n" 
                ;} }
        
    return out;
    }
    
    private String k_arg(ArrayList<Array_def> array,String var) {
        String ret="";
        for (int i=0;i<array.size();i++) {
       if(array.get(i).isarr) ret+=array.get(i).type+"* "+ var +i + ",int size"+i; 
       else
           ret+=array.get(i).type + " var"+i;
        if (i+1!=array.size()) ret+=",";
        }
    return ret;
    }
    
    
     private String k_arg2(ArrayList<Array_def> array,String var) {
        String ret="";
        for (int i=0;i<array.size();i++) {
       if(array.get(i).isarr) ret+= var +i + ",size"+i; 
       else
           ret+=" var"+i;
        if (i+1!=array.size()) ret+=",";
        }
    return ret;
    }
    
    void write_kernel(kernel_param k) {
    String text = "__global__ void kernel(" + k_arg(array,"gpu")+ ") {\n"
        + "const  int idx = blockIdx.x * blockDim.x + threadIdx.x;\n";
    if (k.shared_count!=0) {
    text += "__shared__ "+ k.sh+ " shared_m["+k.shared_count+"];\n";
    }
    if (k.reg_count!=0) for (int reg=0;reg<k.reg_count;reg++) {
    text+= k.reg + "r"+reg+";\n";
    }
        text+=
        
         "}";
    write("kernel.cu",text);
    }
    
    void write(String file1,String text) {
        // FileOutputStream fos; 
        // DataOutputStream dos;

   
Writer writer = null;

try {

File file = new File(file1);

writer = new BufferedWriter(new FileWriter(file));
writer.write(text);
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
} finally {
try {
if (writer != null) {
writer.close();
}
} catch (IOException e) {
e.printStackTrace();
}}
    
    }
}
