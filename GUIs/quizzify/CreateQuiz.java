/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package quizzify;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import util.GetConnection;

/**
 *
 * @author austi
 */
public class CreateQuiz extends javax.swing.JInternalFrame {

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
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubjectMenu = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ContinueButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));
        setPreferredSize(new java.awt.Dimension(778, 522));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(307, 307, 307)
                                                .addComponent(SubjectMenu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(248, 248, 248)
                                                .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(199, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SubjectMenu, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(205, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ContinueButtonActionPerformed

        String subject = SubjectMenu.getItemAt(getSelectedSubjectIndex());
        SwingUtilities.invokeLater(() -> new QuizCreationUI(subject).setVisible(true));
    }// GEN-LAST:event_ContinueButtonActionPerformed

    private int getSelectedSubjectIndex() {
        return SubjectMenu.getSelectedIndex();
    }

    // get subjects from database to add to SubjectMenu
    private String[] getSubjects() {
        String[] subjects = new String[3];
        try (
                Connection conn = GetConnection.getInstance().getConnection();
                Statement stmt = conn.createStatement();) {
            // get subjects from database
            // add subjects to SubjectMenu
            ResultSet rs = stmt.executeQuery("SELECT * FROM subject;");
            int index = 0;
            while (rs.next()) {
                subjects[index] = (rs.getString(2));
                index++;
            }
            Logger.getLogger(CreateQuiz.class.getName()).info("Subjects returned");
            Logger.getLogger(CreateQuiz.class.getName()).log(Level.INFO, "subjects, {0}", subjects);
        } catch (SQLException ex) {
            Logger.getLogger(CreateQuiz.class.getName()).log(Level.SEVERE, "error", ex);
        }
        return subjects;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueButton;
    private javax.swing.JComboBox<String> SubjectMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
