/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuda_template_generator;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
public class ui_array_elem {
    
    JComboBox ptype;
    JRadioButton sel=new JRadioButton();
    JCheckBox auto=new JCheckBox("Auto", true);
    JCheckBox in=new JCheckBox("IN", false);
    JCheckBox out=new JCheckBox("OUT", false);
    JComboBox param_t;

    public ui_array_elem() {
       ptype = new JComboBox();
       ptype.addItem("Array");
       ptype.addItem("Variable");
       ptype.setSize(65, 20);
       ptype.setOpaque(true);
       ptype.setFocusable(true);
       auto.setSelected(true);
       auto.setSize(50, 20);
     
       in.setSize(40, 20);
       out.setSize(50, 20);
       sel.setSize(20, 20);
       param_t=new JComboBox();
      // param_t.setDoubleBuffered(true);
       param_t.setSize(80, 20);
       param_t.addItem("char");
       param_t.addItem("int");
       param_t.addItem("float");
       param_t.addItem("double");
       param_t.addItem("long");
       param_t.setEditable(true);
      
       
       in.setEnabled(false);
       out.setEnabled(false);
     //  param_t.setSelectedIndex(0);
       
       
    }
    
    
}
