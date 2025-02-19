/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.computerscienceia.effortgradegenerator.GUI;

import com.computerscienceia.effortgradegenerator.Classes.ArrayListHelper;
import com.computerscienceia.effortgradegenerator.Classes.Teacher;
import com.computerscienceia.effortgradegenerator.Classes.TeacherManager;
import com.computerscienceia.effortgradegenerator.Classes.ValidationHelper;
import java.awt.Window;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author adith
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        createAccount = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create a new account");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create a new account");

        jLabel2.setText("Username:");

        jLabel3.setText("Password:");

        username.setText("Enter a username");
        username.setToolTipText("");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setText("Enter a password");

        createAccount.setText("Create account");
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });

        jLabel4.setText("Confirm password:");

        confirmPassword.setText("Enter your password again");
        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });

        firstName.setText("First Name");
        firstName.setToolTipText("");
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        firstName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                firstNamePropertyChange(evt);
            }
        });

        jLabel6.setText("Last name:");

        lastName.setText("Last Name");
        lastName.setToolTipText("");
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        id.setText("Your School ID");
        id.setToolTipText("");
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });

        jLabel8.setText("First name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstName)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(createAccount)
                                .addGap(212, 212, 212)))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createAccount)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
    Pattern pattern = Pattern.compile("\\s");
    Matcher matcher1 = pattern.matcher(firstName.getText());
    Matcher matcher2 = pattern.matcher(lastName.getText());
    Matcher matcher3 = pattern.matcher(username.getText());
    Matcher matcher4 = pattern.matcher(password.getText());
    boolean foundFirstName = matcher1.find();
    boolean foundLastName = matcher2.find();
    boolean foundUsername = matcher3.find();
    boolean foundPassword = matcher4.find();
    
    String idChecker = id.getText();
    int idNumber = Integer.parseInt(id.getText());
    int location = ArrayListHelper.binarySearchTeacher(TeacherManager.allTeachers, idNumber);
    if(username.getText().trim().isEmpty()|| firstName.getText().trim().isEmpty()||lastName.getText().trim().isEmpty()||id.getText().trim().isEmpty()||password.getText().trim().isEmpty()||confirmPassword.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please complete all fields");
            return;
        }else if(id.getText().equals("Your School ID")){
            JOptionPane.showMessageDialog(null, "Please enter an ID");
            return;
        }else if(location != -1){
                JOptionPane.showMessageDialog(null,"ID already exists, please login to your existing account");
                return;
        }else if(idNumber>99999 || idNumber<0){
            JOptionPane.showMessageDialog(null, "Invalid ID number. Please enter correct ID");
            return;
        }else if(firstName.getText().length()<3 || lastName.getText().length()<3){
            JOptionPane.showMessageDialog(null, "Please ensure last name and first name are longer than 2 characters");
            return;
        }else if(password.getText().length()<3 || username.getText().length()<3){
            JOptionPane.showMessageDialog(null, "Please ensure username and password are longer than 2 characters");
            return;
        }else if(foundFirstName == true){
            JOptionPane.showMessageDialog(null,"Please ensure there are no whitespaces in your first name");
            return;
        }else if(foundLastName == true){
            JOptionPane.showMessageDialog(null,"Please ensure there are no whitespaces in your last name");
            return;
        }else if(foundUsername == true){
            JOptionPane.showMessageDialog(null,"Please ensure there are no whitespaces in your username");
            return;
        }else if(foundPassword == true){
            JOptionPane.showMessageDialog(null,"Please ensure there are no whitespaces in your password");
            return;
        }else if(!password.getText().equals(confirmPassword.getText())){
            JOptionPane.showMessageDialog(null, "Passwords do not match. Please reconfirm your password.");
            return;
        }else if(!ValidationHelper.isAlpha(firstName.getText()) || !ValidationHelper.isAlpha(lastName.getText())){
            JOptionPane.showMessageDialog(null, "Please only enter alphabets for first name and last name");
            return;
        }else{
    
    String usernameString = username.getText();
    Teacher teacherChecker;
    for(int i = 0; i<TeacherManager.allTeachers.size(); i++){
        teacherChecker = TeacherManager.allTeachers.get(i);
        if(teacherChecker.getUsername().equals(usernameString)){
            JOptionPane.showMessageDialog(null,"Username already exists, please try a different username");
            return;
        }
    }
    
    String firstNameString = firstName.getText();
    String lastNameString = lastName.getText();
    String passwordString = password.getText();
    Teacher newTeacher = new Teacher(usernameString, passwordString, idNumber, firstNameString, lastNameString);
    TeacherManager.addTeacher(newTeacher);
    try {
        TeacherManager.save("Effort Grade Generator");
    } catch (IOException e) {
    }
    this.dispose();
        }
         
    }//GEN-LAST:event_createAccountActionPerformed

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
    }//GEN-LAST:event_idKeyTyped

    private void firstNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_firstNamePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNamePropertyChange

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmPassword;
    private javax.swing.JButton createAccount;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
