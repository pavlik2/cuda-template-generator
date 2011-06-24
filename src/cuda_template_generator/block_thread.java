/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuda_template_generator;

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
public class block_thread {
    int block;
    int thread;

    public block_thread(int block,int thread,int size,int min_block,int MAX_block,int MAX_thread) {
        this.block = block;
        this.thread = thread;
        
        block_thread(size, min_block, MAX_block, MAX_thread);
    }
    
    
    
   boolean
block_thread(int size,int min_block,int MAX_block,int MAX_thread) { 
if (size==MAX_thread*MAX_block) {block=MAX_block;thread=MAX_thread;return true;}
if (size<min_block) {block=size; thread=1; return false;}
if (size<min_block*24) {for (int i=min_block;i<MAX_block;i++) {if (size%i==0)
{block=i; 		thread=size/i; 		return true;}
}}

	
if (size>=min_block) {

	for (int actual_block=min_block;actual_block<=MAX_block;actual_block++) { int actual_thread=size/actual_block;
	if (size%actual_block==0 && size%(actual_thread)==0 && actual_thread>=24 && actual_thread<=MAX_thread) 
		 
		{
			block=actual_block;
			thread=actual_thread; 
			return true;} }
	 } 

if (size>(MAX_thread-1)*MAX_block) {block=MAX_block;thread=MAX_thread;return false;}




for (int actual_thread=64;actual_thread<=MAX_thread;actual_thread++) { 
	int actual_block=size/actual_thread;
if (actual_block<MAX_block) {
			
		block=actual_block+1;
		thread=actual_thread; 



return false;
		
} }
 
return false;
}
    
    
}
