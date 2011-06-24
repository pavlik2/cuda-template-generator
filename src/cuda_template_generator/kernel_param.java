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

public class kernel_param {
int shared_count;
int  reg_count;
String sh;
String reg;
int array_p;
boolean manual_block;
int thread;
int block;
}

