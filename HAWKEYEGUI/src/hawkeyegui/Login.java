/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hawkeyegui;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author God, Giselle Todd, Jodianne Deer, Tai-Vaughn White, Rogerio Jones, Jevoun Tyrell.
 */
public class Login extends javax.swing.JFrame {
   /*  String[] info= {"jodi@gmail.com", "shemar@gmail.com","rogero@gmail.com", "giselle@gmail.com","abigail@gmail.com"};*/
    //ArrayList<String> emailinfo= new ArrayList<String>();
    //ArrayList<String> passinfo= new ArrayList<String>();
    
   // passinfo.add("1234");
    
    
    String[] emailinfo= new String[]{"jodi@hawkeye.com.jm", "tyrell@hawkeye.com.jm","rogerio@hawkeye.com.jm", "giselle@hawkeye.com.jm","tai@hawkeye.com.jm","ezra@hawkeye.com.jm","ilenius@hawkeye.com.jm"};
    String[] emailinfo2={"jessica@hawkeye.com.jm", "sophiajames@hawkeye.com.jm", "justin@hawkeye.com.jm", "ashley@hawkeye.com.jm", "brisha@hawkeye.com.jm"};
    String[] passinfo= new String[]{"1234","34556","76392","sdfw99","5432","sym69ez","ycs445"};
    String[] passinfo2= new String[]{"h1234", "blu7", "ex45", "gg55", "hh44"};
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email_textfeild = new javax.swing.JTextField();
        password_textfeild = new javax.swing.JPasswordField();
        Login_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkeyegui/images/hawkeye4.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EMAIL");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        email_textfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textfeildActionPerformed(evt);
            }
        });

        Login_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Login_button.setText("LOGIN");
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(password_textfeild, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(email_textfeild)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email_textfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_textfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(Login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(444, 19, 459, 543);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("version 1.1");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 554, 130, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HAWKEYE CUSTOMER VEHICLE TRACKING MANAGMENT SYSTEM");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 300, 750, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkeyegui/images/icons8_Falcon_80px.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 210, 90, 120);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HCVTMS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 220, 320, 110);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hawkeyegui/images/bbb.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 920, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_textfeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textfeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textfeildActionPerformed
    
   
    
    
    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        // TODO add your handling code here:
       // String[] emailinfo= new String[]{"jodi@hawkeye.com.jm", "shemar@hawkeye.com.jm","rogero@hawkeye.com.jm", "giselle@hawkeye.com.jm","abigail@hawkeye.com.jm"};
        String[] emailinfo2={"jessica@hawkeye.com.jm", "sophiajames@hawkeye.com.jm", "justin@hawkeye.com.jm", "ashley@hawkeye.com.jm", "brisha@hawkeye.com.jm"};
        
        String email = email_textfeild.getText();
        String password = password_textfeild.getText();
      
            for (int i=0; i<emailinfo.length;i++){
                if(emailinfo[i].equals(email)){
                    if(passinfo[i].equals(password)){
                        JOptionPane.showMessageDialog(rootPane,"Your are logged into Sales");
                        try{
                               FileWriter accept = new FileWriter("LOGINHISTORY.txt",true); 
                               accept.write(System.getProperty("line.separator"));
                               accept.write(email+" from Sales Tracking Department");
                               accept.close();

                           }catch (IOException e){

                               JOptionPane.showMessageDialog(rootPane,"Error");
                           }
                        new Sales().setVisible(true);
                        this.setVisible(false);
                        break;
                        
                    }
                    
                    else{
                       JOptionPane.showMessageDialog(rootPane,"Error: Incorrect password");
                       email_textfeild.setText(null);
                       password_textfeild.setText(null);
                       break;
                    }
                }
                else if(emailinfo2[i].equals(email)){
                    if(passinfo2[i].equals(password)){
                        JOptionPane.showMessageDialog(rootPane,"Your are logged in Vehicle Tracking");
                        try{
                               FileWriter accept = new FileWriter("LOGINHISTORY.txt",true); 
                               accept.write(System.getProperty("line.separator"));
                               accept.write(email+" from Vehicle Tracking Department");
                               accept.close();

                           }catch (IOException e){

                               JOptionPane.showMessageDialog(rootPane,"Error");
                           }
                        new Vehicletrackinghome().setVisible(true);
                        this.setVisible(false);
                        break;

                }else{
                       JOptionPane.showMessageDialog(rootPane,"Error : Incorrect password");
                       email_textfeild.setText(null);
                       password_textfeild.setText(null);
                       break;
                    }
                }else if(i == (emailinfo.length-1)){
                    JOptionPane.showMessageDialog(rootPane,"Error : Incorrect email");
                    email_textfeild.setText(null);
                    password_textfeild.setText(null);
            
        }}
       
        
        
        
        
    }//GEN-LAST:event_Login_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_button;
    private javax.swing.JTextField email_textfeild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password_textfeild;
    // End of variables declaration//GEN-END:variables
}
