/*
 * CUDA_Template_GeneratorView.java
 */
package cuda_template_generator;

import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.lang.Integer;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.*;

/**
 * The application's main frame.
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

public class CUDA_Template_GeneratorView extends FrameView {
    
   ArrayList ui_array;
   ArrayList<mem_param> mem_a = new ArrayList<mem_param>();
   DefaultListModel a = new DefaultListModel();
 // ListModel listM = new DefaultListModel();

    public CUDA_Template_GeneratorView(SingleFrameApplication app) {
        super(app);
    
        initComponents();
        total_param=0;
       
        

      

    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = CUDA_Template_GeneratorApp.getApplication().getMainFrame();
            aboutBox = new CUDA_Template_GeneratorAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);

        }
        
        CUDA_Template_GeneratorApp.getApplication().show(aboutBox);
    }

    
  //@SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox3 = new javax.swing.JComboBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();

        mainPanel.setDoubleBuffered(false);
        mainPanel.setName("mainPanel"); // NOI18N

        jTabbedPane1.setFocusCycleRoot(true);
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setFocusCycleRoot(true);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setName("jPanel1"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cuda_template_generator.CUDA_Template_GeneratorApp.class).getContext().getResourceMap(CUDA_Template_GeneratorView.class);
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setText(resourceMap.getString("jLabel11.text")); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N

        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButton3)
                        .addGap(10, 10, 10)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel11)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jPanel3.setName("jPanel3"); // NOI18N

        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        jCheckBox5.setSelected(true);
        jCheckBox5.setText(resourceMap.getString("jCheckBox5.text")); // NOI18N
        jCheckBox5.setEnabled(false);
        jCheckBox5.setName("jCheckBox5"); // NOI18N
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        jRadioButton2.setText(resourceMap.getString("jRadioButton2.text")); // NOI18N
        jRadioButton2.setEnabled(false);
        jRadioButton2.setName("jRadioButton2"); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText(resourceMap.getString("jRadioButton3.text")); // NOI18N
        jRadioButton3.setEnabled(false);
        jRadioButton3.setName("jRadioButton3"); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jList1.setName("jList1"); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jRadioButton1.setText(resourceMap.getString("jRadioButton1.text")); // NOI18N
        jRadioButton1.setEnabled(false);
        jRadioButton1.setName("jRadioButton1"); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton4.setText(resourceMap.getString("jRadioButton4.text")); // NOI18N
        jRadioButton4.setEnabled(false);
        jRadioButton4.setName("jRadioButton4"); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jCheckBox5)))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jRadioButton2)
                        .addGap(2, 2, 2)
                        .addComponent(jRadioButton3)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox5)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton4)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        jPanel4.setName("jPanel4"); // NOI18N

        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(cuda_template_generator.CUDA_Template_GeneratorApp.class).getContext().getActionMap(CUDA_Template_GeneratorView.class, this);
        jCheckBox7.setAction(actionMap.get("set_shared")); // NOI18N
        jCheckBox7.setText(resourceMap.getString("jCheckBox7.text")); // NOI18N
        jCheckBox7.setName("jCheckBox7"); // NOI18N

        jCheckBox8.setAction(actionMap.get("reg_edit")); // NOI18N
        jCheckBox8.setText(resourceMap.getString("jCheckBox8.text")); // NOI18N
        jCheckBox8.setName("jCheckBox8"); // NOI18N

        jSlider1.setMaximum(32);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(0);
        jSlider1.setEnabled(false);
        jSlider1.setName("jSlider1"); // NOI18N
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jSlider2.setMaximum(128);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setSnapToTicks(true);
        jSlider2.setToolTipText(resourceMap.getString("jSlider2.toolTipText")); // NOI18N
        jSlider2.setValue(0);
        jSlider2.setEnabled(false);
        jSlider2.setName("jSlider2"); // NOI18N
        jSlider2.setValueIsAdjusting(true);
        jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2StateChanged(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "char", "float", "double" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "int", "char", "float", "double" }));
        jComboBox2.setName("jComboBox2"); // NOI18N

        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setEnabled(false);
        jTextField4.setName("jTextField4"); // NOI18N

        jTextField5.setText(resourceMap.getString("jTextField5.text")); // NOI18N
        jTextField5.setEnabled(false);
        jTextField5.setName("jTextField5"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jCheckBox7)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox8)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(199, 199, 199))
        );

        jSlider2.getAccessibleContext().setAccessibleDescription(resourceMap.getString("jSlider2.AccessibleContext.accessibleDescription")); // NOI18N

        jTabbedPane1.addTab(resourceMap.getString("jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

        jPanel5.setName("jPanel5"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setEnabled(false);
        jTextField2.setName("jTextField2"); // NOI18N

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setEnabled(false);
        jTextField3.setName("jTextField3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jButton1.setAction(actionMap.get("comp")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jCheckBox1.setAction(actionMap.get("ch_ar_b_t")); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        jComboBox3.setName("jComboBox3"); // NOI18N

        jCheckBox6.setAction(actionMap.get("unlock_block_thread")); // NOI18N
        jCheckBox6.setText(resourceMap.getString("jCheckBox6.text")); // NOI18N
        jCheckBox6.setName("jCheckBox6"); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox6)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox6)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox1))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel5.TabConstraints.tabTitle"), jPanel5); // NOI18N

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(resourceMap.getIcon("jButton5.icon")); // NOI18N
        jButton5.setText(resourceMap.getString("jButton5.text")); // NOI18N
        jButton5.setToolTipText(resourceMap.getString("jButton5.toolTipText")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(77, 25));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        menuBar.setName("menuBar"); // NOI18N

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jDialog1.setName("jDialog1"); // NOI18N

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents
int tot=1;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jCheckBox5.setEnabled(true);              
        
        
        if (total_param<7) {jComboBox3.addItem("Array"+tot); 
            mem_a.add(new mem_param());
            a.addElement("Array"+tot);
            //a.addElement(1);
      tot++;
            jList1.setModel(a);
        jList1.setSelectedIndex(0);
       

       addpar(total_param+1);
       total_param++; }
       jPanel1.repaint();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
       if(mem_a.get(jList1.getSelectedIndex()).allocated) {jRadioButton2.setSelected(true);
       jRadioButton3.setSelected(false);
       } else {jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(true);}
           if(mem_a.get(jList1.getSelectedIndex()).sync) {jRadioButton1.setSelected(true); 
           jRadioButton4.setSelected(false);
           } else {
           jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(true);
           }
      //  System.out.println(jList1.getSelectedIndex());
        if (a.get(jList1.getSelectedIndex()).equals("Variable")) { jCheckBox5.setEnabled(false);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        
        } else jCheckBox5.setEnabled(true);
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
       
        if (jCheckBox5.isSelected()) {
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        mem_a.get(jList1.getSelectedIndex()).allocated=false; 
        mem_a.get(jList1.getSelectedIndex()).sync=true; 
        } else {
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        if (jRadioButton1.isSelected()) jRadioButton4.setSelected(false);
       mem_a.get(jList1.getSelectedIndex()).sync=true;
       
       
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
       
         if (jRadioButton4.isSelected()) jRadioButton1.setSelected(false);
         mem_a.get(jList1.getSelectedIndex()).sync=false;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       
          if (jRadioButton2.isSelected()) jRadioButton3.setSelected(false);
           mem_a.get(jList1.getSelectedIndex()).allocated=true;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       
         if (jRadioButton3.isSelected()) jRadioButton2.setSelected(false);
          mem_a.get(jList1.getSelectedIndex()).allocated=false;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if (total_param
        <=0)  jCheckBox5.setEnabled(false); else {
int sel = find_sel();
System.out.print(sel);
if (sel!=-1) {
mem_a.remove(sel);

a.remove(sel);
jComboBox3.removeItemAt(sel);
rem_elem(sel);
total_param--; }
}
     //   a.remove(1);
    }//GEN-LAST:event_jButton4ActionPerformed
int find_sel() {
 for (int i=0;i<total_param;i++) { 
    int py=(i+1)*25+15;
        {JRadioButton b =  (JRadioButton)jPanel1.getComponentAt(100,py );
       if (b.isSelected()) {
       return i;
       } }
        }
    return -1;
    
}

void rem_elem(int num) {
 for (int i=num;i<total_param-1;i++) {
    int beg_y=(i+1)*25+15;
 jPanel1.remove( jPanel1.getComponentAt(100,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(130,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(190,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(230,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(300,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(10,beg_y )); 
  int beg_y2=(i+2)*25+15;
 jPanel1.add(jPanel1.getComponentAt(10,beg_y2 )).setLocation(10, beg_y);
 jPanel1.add(jPanel1.getComponentAt(100,beg_y2 )).setLocation(100, beg_y);
 jPanel1.add(jPanel1.getComponentAt(130,beg_y2 )).setLocation(130, beg_y);
 jPanel1.add(jPanel1.getComponentAt(190,beg_y2 )).setLocation(190, beg_y);
 jPanel1.add(jPanel1.getComponentAt(230,beg_y2 )).setLocation(230, beg_y);
 jPanel1.add(jPanel1.getComponentAt(300,beg_y2 )).setLocation(300, beg_y);
 
 
 }
 int beg_y=(total_param)*25+15;
 jPanel1.remove( jPanel1.getComponentAt(100,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(130,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(190,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(230,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(300,beg_y ));
 jPanel1.remove( jPanel1.getComponentAt(10,beg_y )); 
 jPanel1.validate();
 
         
         
// jPanel1.removeAll(); 
 ////jPanel1.validate();
                jPanel1.repaint();
 
 
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        //JButton b = (JButton) evt.getSource();
        //System.out.print(b.getLocation().x);
        
        succ=true;
        if (total_param>0) {
        gen();
       if(succ) JOptionPane.showMessageDialog(null, "code genereated"); 
       else JOptionPane.showMessageDialog(null, "code not genereated (missing input)");
        } 
        
        else
            
        {JOptionPane.showMessageDialog(null, "code not genereated (missing input)");}
        
        
}//GEN-LAST:event_jButton2ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
       if (jList1.getSelectedIndex()>=0) 
           if (!a.get(jList1.getSelectedIndex()).equals("Variable"))  
               jCheckBox5.setEnabled(true); else jCheckBox5.setEnabled(false);
        if (total_param>0) {
           for (int param_n=1;param_n<total_param+1;param_n++) {
       int beg_y=param_n*25+15;
    
   
   if (jList1.getSelectedIndex()>=0) {
     JComboBox com = (JComboBox)  jPanel1.getComponentAt(10,beg_y);
     if (com.getSelectedIndex()==1)  a.set(param_n-1, "Variable"); 
     else {a.set(param_n-1, "Array"+param_n);
     }
     }
     
           }  }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        // TODO add your handling code here:
       Integer t = new Integer (jSlider2.getValue());
        jTextField4.setText(t.toString());
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        Integer t = new Integer (jSlider1.getValue());
        jTextField5.setText(t.toString());
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
        String url = "https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=36KPPJDYGLKUY";
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(CUDA_Template_GeneratorView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5MouseClicked

    void check_action(java.awt.event.ActionEvent evt) {
    // TODO: sdfsfd
        JCheckBox c = (JCheckBox) evt.getSource();
      //  System.out.print(c.getLocation().x);
     //   System.out.print(c.getLocation().y);
        if (!c.isSelected()) {
       JCheckBox a =  (JCheckBox)jPanel1.getComponentAt(190, c.getLocation().y);
        a.setEnabled(true);
        JCheckBox b =  (JCheckBox)jPanel1.getComponentAt(230, c.getLocation().y);
        b.setEnabled(true); } else {
        JCheckBox a =  (JCheckBox)jPanel1.getComponentAt(190, c.getLocation().y);
        a.setEnabled(false);
         a.setSelected(false);
        JCheckBox b =  (JCheckBox)jPanel1.getComponentAt(230, c.getLocation().y);
        b.setEnabled(false);
        b.setSelected(false);
        
        }
        
    };
    
     void check_action2(java.awt.event.ActionEvent evt) {
    // TODO: sdfsfd
        JCheckBox c = (JCheckBox) evt.getSource();
      //  System.out.print(c.getLocation().x);
     //   System.out.print(c.getLocation().y);
        if (!c.isSelected()) {
       
        JCheckBox b =  (JCheckBox)jPanel1.getComponentAt(230, c.getLocation().y);
       if (!b.isSelected()) c.setSelected(true);
        
        }
        
    };
     
      void check_action3(java.awt.event.ActionEvent evt) {
    // TODO: sdfsfd
        JCheckBox c = (JCheckBox) evt.getSource();
      //  System.out.print(c.getLocation().x);
     //   System.out.print(c.getLocation().y);
         if (!c.isSelected()) {
       
        JCheckBox b =  (JCheckBox)jPanel1.getComponentAt(190, c.getLocation().y);
       if (!b.isSelected()) c.setSelected(true);
        
        }
        
    };
    
    void addpar(int param_n) {
    int beg_y=param_n*25+15;
    
    ui_array_elem temp = new ui_array_elem();
    temp.param_t.invalidate();
        jPanel1.add(temp.ptype).setLocation(10,beg_y);
        temp.auto.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.print("action_check\n");
                check_action(e);
//                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        temp.in.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.print("action_check2\n");
                check_action2(e);
//                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        temp.out.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.print("action_check3\n");
                check_action3(e);
//                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
        jPanel1.add(temp.auto).setLocation(130,beg_y);
        jPanel1.add(temp.in).setLocation(190,beg_y);
        jPanel1.add(temp.out).setLocation(230,beg_y);
        jPanel1.add(temp.param_t).setLocation(300,beg_y);
        temp.sel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
               check_action4(e);
            }
        });
        jPanel1.add(temp.sel).setLocation(100,beg_y);
        jPanel1.paintImmediately(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        jPanel1.invalidate();
    }
    void check_action4(java.awt.event.ActionEvent evt) {
    // TODO: sdfsfd
        JRadioButton c = (JRadioButton) evt.getSource();
      //  System.out.print(c.getLocation().x);
     //   System.out.print(c.getLocation().y);
         
        for (int i=0;i<total_param;i++) { 
    int py=(i+1)*25+15;
       if (py!=c.getLocation().y) {JRadioButton b =  (JRadioButton)jPanel1.getComponentAt(100,py );
       b.setSelected(false); }
        }
        
        
    };
    boolean succ=true;
    void add_el(ArrayList<Array_def> arr) {
    kernel_param ker = new kernel_param();
    
    for (int i=0;i<total_param;i++) { 
    int py=(i+1)*25+15;
    javax.swing.JCheckBox check1 = (javax.swing.JCheckBox) jPanel1.getComponentAt(130, py);
        
       
    if (check1.isSelected()) {
   javax.swing.JComboBox par = (javax.swing.JComboBox)jPanel1.getComponentAt(300, py);
   boolean isarr; 
   javax.swing.JComboBox p_typ = (javax.swing.JComboBox)jPanel1.getComponentAt(10, py);
   if (p_typ.getSelectedIndex()==0) isarr=true; else isarr=false;
   
   arr.add(new Array_def(par.getSelectedItem().toString(),isarr,mem_a.get(i).sync,mem_a.get(i).allocated));
  // System.out.println(par.getSelectedItem().toString());
    //System.out.println(arr.get(i).type);
       
   
    } 
    else {
     javax.swing.JCheckBox check_in = (javax.swing.JCheckBox) (jPanel1.getComponentAt(190, py));
     javax.swing.JCheckBox check_out = (javax.swing.JCheckBox) (jPanel1.getComponentAt(230, py));
      javax.swing.JComboBox par = (javax.swing.JComboBox)jPanel1.getComponentAt(300, py);
  System.out.println(check_in.isSelected());
   
   arr.add(new Array_def(par.getSelectedItem().toString(),check_in.isSelected(),check_out.isSelected(),mem_a.get(i).sync,mem_a.get(i).allocated));
     
    
   
    
    }
    
     ker.shared_count=jSlider2.getValue();
    ker.reg_count=jSlider1.getValue();
    ker.sh=jComboBox1.getSelectedItem().toString();
    ker.reg=jComboBox2.getSelectedItem().toString();
    if (jCheckBox1.isSelected()) {ker.manual_block=false; ker.array_p=jComboBox3.getSelectedIndex();}
    else
    {ker.manual_block=true; 
        try {
            ker.thread=new Integer(jTextField3.getText().trim()); 
    ker.block=new Integer(jTextField2.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "wrong manual block or thread"); 
    succ=false;
    break;
        }
     
    
    if (ker.manual_block && (ker.thread>512 || ker.block>65535)) {
    JOptionPane.showMessageDialog(null, "wrong manual block or thread"); 
    succ=false;
    break;
    }
    
    }
    
    
    } //System.out.println("123");
    new File_rw(arr,ker);
   // 
  
    }
    @Action
    public void gen() {
        arr = new ArrayList<Array_def>();
        add_el(arr);
     //   System.out.println("etert");
    
        
    }

    @Action
    public void set_shared() {
        if (jCheckBox7.isSelected()) jSlider2.setEnabled(true); else {jSlider2.setEnabled(false);
        jSlider2.setValue(0);
        jTextField4.setText("");
        
        }
        
        
    }

    @Action
    public void reg_edit() {
         if (jCheckBox8.isSelected()) jSlider1.setEnabled(true); else {jSlider1.setEnabled(false);
        jSlider1.setValue(0);
         jTextField5.setText("");
        }
    }

    @Action
    public void ch_ar_b_t() {
        if (jCheckBox1.isSelected()) {jTextField1.setEnabled(false);
        jComboBox3.setEnabled(true); jButton1.setEnabled(false);
        jCheckBox6.setEnabled(false);
        } else
        { jTextField1.setEnabled(true); jButton1.setEnabled(true);
        jComboBox3.setEnabled(false);
         jCheckBox6.setEnabled(true);
        }
    }

    @Action
    public void comp() {
        int size;
        size = new Integer(jTextField1.getText()).intValue() ;
        
      //  System.out.print(size);
        int block=0; int thread=0;
      block_thread b = new  block_thread(block,thread,size,4,65535,512);
      
       jTextField2.setText(Integer.toString(b.block));
        jTextField3.setText(Integer.toString(b.thread));
        
    }

    @Action
    public void unlock_block_thread() {
        if (jCheckBox6.isSelected()) {
        jTextField2.setEnabled(true);
        jTextField3.setEnabled(true);
        } else {
        jTextField2.setEnabled(false);
        jTextField3.setEnabled(false);
        }
    }

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Array_def> arr;
    private JDialog aboutBox;
    private int total_param;
    
}
