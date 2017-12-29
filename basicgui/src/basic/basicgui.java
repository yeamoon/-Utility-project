
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nishi
 */
public class basicgui extends javax.swing.JFrame {
      String fn,add,country,gend;
      String degree="";
      String gap=" ";
      JFileChooser fc;
      File dir;
      DefaultTableModel model;
      File file=null;
    /**
     * Creates new form basicgui
     */
    public basicgui() {
        initComponents();
        model= new DefaultTableModel();
        tblstudent.setModel(model);
        model.addColumn("Name");
                model.addColumn("Address");
                                model.addColumn("Country");
                model.addColumn("Gender");
                model.addColumn("Degree");


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        jcombcountry = new javax.swing.JComboBox<>();
        rdmale = new javax.swing.JRadioButton();
        rdfemale = new javax.swing.JRadioButton();
        pnldegree = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtshow = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnsave = new javax.swing.JButton();
        areadisplay = new javax.swing.JButton();
        tbldisplay = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        tblexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("student information");
        setBackground(new java.awt.Color(255, 0, 51));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("personal info"));
        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("country");

        jLabel4.setText("Gender");

        jLabel5.setText("Degree");

        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });

        jcombcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<-select item->", "Bangladesh", "India", "CHINA" }));
        jcombcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombcountryActionPerformed(evt);
            }
        });

        gender.add(rdmale);
        rdmale.setText("male");
        rdmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmaleActionPerformed(evt);
            }
        });

        gender.add(rdfemale);
        rdfemale.setText("female");

        jCheckBox1.setText("ssc");

        jCheckBox2.setText("hsc");

        javax.swing.GroupLayout pnldegreeLayout = new javax.swing.GroupLayout(pnldegree);
        pnldegree.setLayout(pnldegreeLayout);
        pnldegreeLayout.setHorizontalGroup(
            pnldegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldegreeLayout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addGap(29, 29, 29)
                .addComponent(jCheckBox2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnldegreeLayout.setVerticalGroup(
            pnldegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldegreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnldegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tblstudent.setBackground(new java.awt.Color(153, 153, 0));
        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "country", "Gender", "Degree"
            }
        ));
        jScrollPane2.setViewportView(tblstudent);

        txtshow.setColumns(20);
        txtshow.setRows(5);
        jScrollPane3.setViewportView(txtshow);

        jLabel6.setText("all students");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        areadisplay.setText("Display in txtarea");
        areadisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areadisplayActionPerformed(evt);
            }
        });

        tbldisplay.setText("Display in table");

        btnclear.setText("clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        tblexit.setText("exit");
        tblexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(areadisplay)
                .addGap(18, 18, 18)
                .addComponent(tbldisplay)
                .addGap(18, 18, 18)
                .addComponent(btnclear)
                .addGap(18, 18, 18)
                .addComponent(tblexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(areadisplay)
                    .addComponent(tbldisplay)
                    .addComponent(btnclear)
                    .addComponent(tblexit))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(txtname))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(pnldegree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(rdmale)
                        .addGap(33, 33, 33)
                        .addComponent(rdfemale)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcombcountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtadd)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jcombcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdmale)
                    .addComponent(rdfemale))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnldegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddActionPerformed

    private void jcombcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombcountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombcountryActionPerformed

    private void rdmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmaleActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
     getallrecord();
     if(txtname.getText().isEmpty()){
         JOptionPane.showMessageDialog(rootPane, "please enter name");
         txtname.requestFocus();
     }
     else{
         if(jcombcountry.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(rootPane, "please select country");
 
         }
         else{
           fc=new JFileChooser(dir);
            
           FileNameExtensionFilter filter =new FileNameExtensionFilter("*.txt",new String[]{"txt"});
         fc.addChoosableFileFilter(filter);
         int option=fc.showSaveDialog(this);
         if(option==JFileChooser.APPROVE_OPTION){
             dir=fc.getCurrentDirectory();
             model.addRow(new Object[]{fn,add,country,gend,degree});
             file=fc.getSelectedFile();
               try {
                   writeall();
               } catch (IOException ex) {
              ex.printStackTrace();
               }
               degree="";
         }
         
         }
         
         
     }
 // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void areadisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areadisplayActionPerformed
        // TODO add your handling code here:
        displaytarea();
        
    }//GEN-LAST:event_areadisplayActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
                  clear();
    }//GEN-LAST:event_btnclearActionPerformed

    private void tblexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tblexitActionPerformed
private void getallrecord(){
    fn=txtname.getText();
    add=txtadd.getText();
    country=jcombcountry.getSelectedItem().toString();
    if(rdmale.isSelected()){
        gend="male";
    }
    else{
        gend="female";
    }
    for(int i=0;i<pnldegree.getComponentCount();i++){
        
        JCheckBox checkbox=( JCheckBox)pnldegree.getComponent(i);
    if(checkbox.isSelected()){
        degree+=checkbox.getText();
        degree+=gap;
    }
    
    }
    
    
}
private void writeall() throws IOException{
    BufferedWriter buf=null;
    try{
      buf=new BufferedWriter(new FileWriter(file+getextension(),true));
        buf.write(fn+", "+add+","+country+","+gend+","+degree);
        buf.newLine();
        JOptionPane.showMessageDialog(rootPane, "data saved");
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        if(buf!=null){
            buf.close();
        }
    }
    
}
private String getextension(){
    String ext="";
    String extension =fc.getFileFilter().getDescription();
    if(extension.equals("*.txt")){
        ext=".txt";
    }
   return ext; 
}


private void displaytarea(){
    
    FileInputStream fobj=null;
    fc=new JFileChooser(dir);
    int option=fc.showOpenDialog(this);
    if(option==JFileChooser.APPROVE_OPTION){
        dir=fc.getCurrentDirectory();
        file=fc.getSelectedFile();
        try{
            String str="";
            fobj=new FileInputStream(file);
            int len=(int)file.length();
            for(int i=0;i<len;i++){
                char str2=0;
                try{
                    str2=(char)fobj.read();
                    if(str2==','){
                        str2='\t';
                    }
                }
                catch(IOException ex){
                   ex.printStackTrace();
                }
                str=str+str2;
            }
            txtshow.setText(str);
        }
        catch(IOException EX){
           EX.printStackTrace();
        }finally{
            try {
               if(fobj!=null){
                   fobj.close();
               } 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
private void clear(){
    txtname.setText("");
    txtadd.setText("");
    jcombcountry.setSelectedItem(0);
    degree="";
    gender.clearSelection();
    for(int i=0;i<pnldegree.getComponentCount();i++){
        JCheckBox checkBox=(JCheckBox)pnldegree.getComponent(i);
        if(checkBox.isSelected()){
            checkBox.setSelected(false);
        }
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(basicgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(basicgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(basicgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(basicgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new basicgui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton areadisplay;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcombcountry;
    private javax.swing.JPanel pnldegree;
    private javax.swing.JRadioButton rdfemale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JButton tbldisplay;
    private javax.swing.JButton tblexit;
    private javax.swing.JTable tblstudent;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtshow;
    // End of variables declaration//GEN-END:variables
}
