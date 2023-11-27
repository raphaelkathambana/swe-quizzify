/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package quizzify;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JOptionPane;

import util.Operation;

/**
 *
 * @author austi
 */
public class CreateQuiz extends javax.swing.JInternalFrame {

    private boolean valid;

    /**
     * Creates new form CreateQuiz
     */
    public CreateQuiz() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubjectMenu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ContinueButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfQuizTitle = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 51));
        setMaximumSize(new java.awt.Dimension(1100, 670));
        setMinimumSize(new java.awt.Dimension(1100, 670));
        setPreferredSize(new java.awt.Dimension(1100, 670));

        SubjectMenu.setModel(new javax.swing.DefaultComboBoxModel<>(getSubjects()));


        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("What subject will you be adding to?");

        ContinueButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ContinueButton.setText("Continue");
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Title of your Quiz");

        tfQuizTitle.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        tfQuizTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(SubjectMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 340, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfQuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(432, 432, 432))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SubjectMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(tfQuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ContinueButtonActionPerformed
        String subject = SubjectMenu.getItemAt(getSelectedSubjectIndex());
        String quizTitle = this.validate(tfQuizTitle.getText());
        if (!valid) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields");
            return;
        }
        Logger.getLogger(CreateQuiz.class.getName()).info("Quiz Data Forwarded");
        Logger.getLogger(CreateQuiz.class.getName()).log(Level.INFO, "subject: {0}", subject);
        Logger.getLogger(CreateQuiz.class.getName()).log(Level.INFO, "title: {0}", quizTitle);
        SwingUtilities.invokeLater(() -> new QuizCreationUI(subject, quizTitle).setVisible(true));
    }// GEN-LAST:event_ContinueButtonActionPerformed

    private int getSelectedSubjectIndex() {
        return SubjectMenu.getSelectedIndex();
    }

    // get subjects from database to add to SubjectMenu
    private String[] getSubjects() {
        Operation operation = new Operation();
        return operation.getSubjectsFromDatabase();
    }

    private String validate(String args) {
        // check if empty
        valid = !(args.isEmpty() || args.length() == 0 || args.equals(""));
        return args;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueButton;
    private javax.swing.JComboBox<String> SubjectMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfQuizTitle;
    // End of variables declaration//GEN-END:variables
}
