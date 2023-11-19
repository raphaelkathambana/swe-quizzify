/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizzify;

import javax.swing.*;
import java.awt.Color;
import util.Operation;
/**
 *
 * @author austi
 */
public class TeachersLogin extends JFrame{

    Operation O = new Operation();
    char[] focused = { '0', '0' };
    boolean empty = false;
    boolean PassSee = false;
    String userType = "Teach";

    public TeachersLogin() {
        initComponents();
        teachIDfield.setForeground(Color.GRAY);
        teachIDfield.setText("  ID");
        passwordField.setForeground(Color.GRAY);
        passwordField.setText("  Password");
        if (focused[1] == '0'){
            passwordField.setEchoChar((char) 0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LoginLabel = new javax.swing.JLabel();
        IDlabel = new javax.swing.JLabel();
        teachIDfield = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        closeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        loginButton1 = new javax.swing.JButton();
        ShowPass = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/QUIZZIFY-removebg-preview2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(LogoLabel)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(LogoLabel)
                .addGap(96, 96, 96))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(null);

        LoginLabel.setBackground(new java.awt.Color(153, 0, 153));
        LoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(102, 0, 102));
        LoginLabel.setText("TEACHER'S LOGIN");
        jPanel2.add(LoginLabel);
        LoginLabel.setBounds(39, 68, 320, 45);

        IDlabel.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        IDlabel.setText("ID Number:");
        jPanel2.add(IDlabel);
        IDlabel.setBounds(40, 131, 125, 29);

        teachIDfield.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        teachIDfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teachIDfieldFocusGained(evt);
            }
        });
        jPanel2.add(teachIDfield);
        teachIDfield.setBounds(40, 166, 317, 40);

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        PasswordLabel.setText("Password:");
        jPanel2.add(PasswordLabel);
        PasswordLabel.setBounds(40, 221, 102, 29);

        ClearButton.setBackground(new java.awt.Color(255, 255, 51));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ClearButton.setText("CLEAR");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ClearButton);
        ClearButton.setBounds(40, 360, 145, 55);

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        passwordField.setMinimumSize(new java.awt.Dimension(96, 37));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        jPanel2.add(passwordField);
        passwordField.setBounds(40, 256, 317, 43);

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Close_100px_22.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });
        jPanel2.add(closeLabel);
        closeLabel.setBounds(370, 0, 30, 41);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Don't have an account?");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 440, 210, 25);

        signUpButton.setBackground(new java.awt.Color(255, 255, 51));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        signUpButton.setText("Sign up!");
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });
        jPanel2.add(signUpButton);
        signUpButton.setBounds(250, 440, 120, 33);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_back_30px.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back);
        back.setBounds(0, 5, 55, 30);

        loginButton1.setBackground(new java.awt.Color(255, 255, 51));
        loginButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton1.setText("LOGIN");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton1);
        loginButton1.setBounds(210, 360, 145, 55);

        ShowPass.setBackground(new java.awt.Color(255, 255, 255));
        ShowPass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ShowPass.setText("Show Password");
        ShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPassActionPerformed(evt);
            }
        });
        jPanel2.add(ShowPass);
        ShowPass.setBounds(203, 310, 160, 31);

        jTextField1.setPreferredSize(new java.awt.Dimension(0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(60, 30, 0, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        String strID = "";
        int theID = 0;
        String thePass = String.valueOf(passwordField.getPassword());
        try {
            strID = teachIDfield.getText();
            theID = Integer.valueOf(strID);
        } catch (NumberFormatException ex) {
                
        }
        if (strID.isEmpty() || focused[0] == '0')
            empty = true;

        if (thePass.isEmpty() || focused[1] == '0')
            empty = true;

        if (empty == false) {

            O.SignIn(theID, thePass, userType);
            if (theID == O.getId() && thePass.equals(O.getPass())) {
                // JOptionPane.showMessageDialog(this, "Loged in!");

                QuizzifyDashboard Q = new QuizzifyDashboard();
                Q.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Email or Password");
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Please Fill Out All The Details");
            empty = false;
        }
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void teachIDfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teachIDfieldFocusGained
        if (evt.getSource() == teachIDfield && focused[0] == '0') {
            teachIDfield.setText("");
            teachIDfield.setForeground(Color.BLACK);
            focused[0] = '1';
        }
        
    }//GEN-LAST:event_teachIDfieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        if (evt.getSource() == passwordField && focused[1] == '0') {
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK);
            passwordField.setEchoChar('*');
            focused[1] = '1';
        } 
    }//GEN-LAST:event_passwordFieldFocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ClearButtonActionPerformed
        if (focused[0] == '1')
            teachIDfield.setText("");
        if (focused[1] == '1')
            passwordField.setText(""); 
    }// GEN-LAST:event_ClearButtonActionPerformed
    
    private void ShowPassActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ShowPassActionPerformed
        if (focused[1] == '1') {
            if (PassSee == false) {
                PassSee = true;
                passwordField.setEchoChar((char) 0);
            } else if (PassSee == true) {
                PassSee = false;
                passwordField.setEchoChar('*');
            }
        }
    }

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_closeLabelMouseClicked
        this.dispose();
    }// GEN-LAST:event_closeLabelMouseClicked

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signUpButtonMouseClicked
        TeacherSignUp signup = new TeacherSignUp();
        signup.setVisible(true);
        signup.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_signUpButtonMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel7MouseClicked
        EntryPage entrypage = new EntryPage();
        entrypage.setVisible(true);
        entrypage.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeachersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachersLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel IDlabel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JRadioButton ShowPass;
    private javax.swing.JLabel back;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginButton1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField teachIDfield;
    // End of variables declaration//GEN-END:variables
}
