//test


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuda_template_generator;

/**
 *
 * @author Pavel
 * 
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
public class Array_def {
    public boolean auto;
    public boolean isarr;
    public boolean sync;
    boolean allocated;
    public String type;
    public boolean I;
    public boolean O;

    public Array_def(String type, boolean I, boolean O,boolean sync,boolean allocated) {
        auto = false;
        isarr=true;
        
        this.type = type;
        this.I = I;
        this.O = O;
        this.allocated=allocated;
        this.sync = sync;
    }

    public Array_def(String type,boolean isarr,boolean sync,boolean allocated) {
        auto = true;
        this.type = type;
        this.isarr = isarr;
        if(isarr) {
        this.I = true;
        this.O = true; 
        this.allocated=allocated;
        this.sync
               = sync;
        } else
        {
        this.I = false;
        this.O = false;
        }
        
    }
    
    
}
