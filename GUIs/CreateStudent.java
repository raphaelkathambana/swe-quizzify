/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package quizzify;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author austi
 */
public class CreateStudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form CreateStudent
     */
    public CreateStudent() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        studIDfield = new javax.swing.JTextField();
        studNameField = new javax.swing.JTextField();
        studEmailField = new javax.swing.JTextField();
        studPassword = new javax.swing.JTextField();
        createStudAccButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(1100, 670));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setText("Create Student Account");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 40, 580, 80);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 150, 190, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 210, 180, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 270, 170, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 330, 180, 32);

        studIDfield.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(studIDfield);
        studIDfield.setBounds(300, 150, 520, 37);

        studNameField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(studNameField);
        studNameField.setBounds(300, 210, 520, 37);

        studEmailField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(studEmailField);
        studEmailField.setBounds(300, 270, 520, 37);

        studPassword.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(studPassword);
        studPassword.setBounds(300, 330, 520, 37);

        createStudAccButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createStudAccButton.setText("Create Account");
        getContentPane().add(createStudAccButton);
        createStudAccButton.setBounds(440, 410, 240, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createStudAccButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField studEmailField;
    private javax.swing.JTextField studIDfield;
    private javax.swing.JTextField studNameField;
    private javax.swing.JTextField studPassword;
    // End of variables declaration//GEN-END:variables
}
