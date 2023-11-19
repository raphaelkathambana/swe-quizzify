/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizzify;

import java.awt.Color;

/**
 *
 * @author austi
 */
public class QuizzifyDashboard extends javax.swing.JFrame {

    /**
     * Creates new form QuizzifyDashboard
     */
    
    Color DefaultColour, ClickedColour;
    
    public QuizzifyDashboard() {
        initComponents();
        DefaultColour= new Color(153,0,153);
        ClickedColour= new Color(255,255,51);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        createStud = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        viewStud = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        quizzes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        studentProg = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        ViewScreen = new javax.swing.JDesktopPane();
        bigLogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2.png"))); // NOI18N
        logoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoLabelMousePressed(evt);
            }
        });

        closeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Close_100px_22.png"))); // NOI18N
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
        });

        WelcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        WelcomeLabel.setText("Welcome,");

        NameLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(logoLabel)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(330, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeLabel)
                        .addGap(25, 25, 25))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(closeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(logoLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 1290, 170);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        createStud.setBackground(new java.awt.Color(153, 0, 153));
        createStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createStudMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createStudMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Create Student Account");

        javax.swing.GroupLayout createStudLayout = new javax.swing.GroupLayout(createStud);
        createStud.setLayout(createStudLayout);
        createStudLayout.setHorizontalGroup(
            createStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createStudLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        createStudLayout.setVerticalGroup(
            createStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createStudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        viewStud.setBackground(new java.awt.Color(153, 0, 153));
        viewStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewStudMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewStudMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View Students");

        javax.swing.GroupLayout viewStudLayout = new javax.swing.GroupLayout(viewStud);
        viewStud.setLayout(viewStudLayout);
        viewStudLayout.setHorizontalGroup(
            viewStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStudLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        viewStudLayout.setVerticalGroup(
            viewStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        quizzes.setBackground(new java.awt.Color(153, 0, 153));
        quizzes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quizzesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quizzesMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quizzes");

        javax.swing.GroupLayout quizzesLayout = new javax.swing.GroupLayout(quizzes);
        quizzes.setLayout(quizzesLayout);
        quizzesLayout.setHorizontalGroup(
            quizzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizzesLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        quizzesLayout.setVerticalGroup(
            quizzesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizzesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        studentProg.setBackground(new java.awt.Color(153, 0, 153));
        studentProg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentProgMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentProgMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student Progress");

        javax.swing.GroupLayout studentProgLayout = new javax.swing.GroupLayout(studentProg);
        studentProg.setLayout(studentProgLayout);
        studentProgLayout.setHorizontalGroup(
            studentProgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentProgLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        studentProgLayout.setVerticalGroup(
            studentProgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentProgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        logoutButton.setBackground(new java.awt.Color(255, 255, 51));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createStud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quizzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentProg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(createStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(viewStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quizzes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(logoutButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1);
        jPanel1.setBounds(0, 170, 240, 530);

        ViewScreen.setBackground(new java.awt.Color(255, 255, 51));

        bigLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/QUIZZIFY-removebg-preview.png"))); // NOI18N

        ViewScreen.setLayer(bigLogoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ViewScreenLayout = new javax.swing.GroupLayout(ViewScreen);
        ViewScreen.setLayout(ViewScreenLayout);
        ViewScreenLayout.setHorizontalGroup(
            ViewScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewScreenLayout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addComponent(bigLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        ViewScreenLayout.setVerticalGroup(
            ViewScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewScreenLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bigLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(ViewScreen);
        ViewScreen.setBounds(240, 170, 1050, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeLabelMouseClicked

    private void createStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createStudMousePressed
        // TODO add your handling code here:
        createStud.setBackground(ClickedColour);
        viewStud.setBackground(DefaultColour);
        quizzes.setBackground(DefaultColour);
        studentProg.setBackground(DefaultColour);
        
    }//GEN-LAST:event_createStudMousePressed

    private void viewStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStudMousePressed
        // TODO add your handling code here:
        createStud.setBackground(DefaultColour);
        viewStud.setBackground(ClickedColour);
        quizzes.setBackground(DefaultColour);
        studentProg.setBackground(DefaultColour);
    }//GEN-LAST:event_viewStudMousePressed

    private void quizzesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizzesMousePressed
        // TODO add your handling code here:
        createStud.setBackground(DefaultColour);
        viewStud.setBackground(DefaultColour);
        quizzes.setBackground(ClickedColour);
        studentProg.setBackground(DefaultColour);
    }//GEN-LAST:event_quizzesMousePressed

    private void studentProgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentProgMousePressed
        // TODO add your handling code here:
        createStud.setBackground(DefaultColour);
        viewStud.setBackground(DefaultColour);
        quizzes.setBackground(DefaultColour);
        studentProg.setBackground(ClickedColour);
    }//GEN-LAST:event_studentProgMousePressed

    private void createStudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createStudMouseClicked
        // TODO add your handling code here:
        StudentSignUp createstudent = new StudentSignUp();
        ViewScreen.removeAll();
        ViewScreen.add(createstudent).setVisible(true);
    }//GEN-LAST:event_createStudMouseClicked

    private void viewStudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewStudMouseClicked
        // TODO add your handling code here:
        ViewStudents viewstudent = new ViewStudents();
        ViewScreen.removeAll();
        ViewScreen.add(viewstudent).setVisible(true);
    }//GEN-LAST:event_viewStudMouseClicked

    private void studentProgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentProgMouseClicked
        // TODO add your handling code here:
        StudentProgress progress = new StudentProgress();
        ViewScreen.removeAll();
        ViewScreen.add(progress).setVisible(true);
    }//GEN-LAST:event_studentProgMouseClicked

    private void logoLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoLabelMousePressed
        // TODO add your handling code here:
        ViewScreen.removeAll();
    }//GEN-LAST:event_logoLabelMousePressed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        TeachersLogin login = new TeachersLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void quizzesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizzesMouseClicked
        // TODO add your handling code here:
        QuizMenu quiz = new QuizMenu();
        ViewScreen.removeAll();
        ViewScreen.add(quiz).setVisible(true);
    }//GEN-LAST:event_quizzesMouseClicked

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
            java.util.logging.Logger.getLogger(QuizzifyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizzifyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizzifyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizzifyDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizzifyDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NameLabel;
    private javax.swing.JDesktopPane ViewScreen;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel bigLogoLabel;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel createStud;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel quizzes;
    private javax.swing.JPanel studentProg;
    private javax.swing.JPanel viewStud;
    // End of variables declaration//GEN-END:variables
}
