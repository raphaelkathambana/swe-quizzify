/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizzify;

/**
 *
 * @author JC
 */
public class EditQuiz extends javax.swing.JFrame {

    /**
     * Creates new form QuizCreation
     */
    public EditQuiz() {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        QuestionPanel = new javax.swing.JPanel();
        QuestionTextField = new javax.swing.JTextField();
        QuestionLabel = new javax.swing.JLabel();
        Opt2Panel = new javax.swing.JPanel();
        Option2RadioBtn = new javax.swing.JRadioButton();
        OptionBLabel = new javax.swing.JLabel();
        Opt1Panel = new javax.swing.JPanel();
        Option1RadioBtn = new javax.swing.JRadioButton();
        OptionALabel = new javax.swing.JLabel();
        Opt3Panel = new javax.swing.JPanel();
        Option3Radiobtn = new javax.swing.JRadioButton();
        OptionCLabel = new javax.swing.JLabel();
        Opt4Panel = new javax.swing.JPanel();
        Option4RadioBtn = new javax.swing.JRadioButton();
        OptionDLabel = new javax.swing.JLabel();
        PreviousBttn = new javax.swing.JButton();
        NextBttn = new javax.swing.JButton();
        CloseProgressReportbttn = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        QuestionPanel.setBackground(new java.awt.Color(255, 255, 102));

        QuestionTextField.setBackground(new java.awt.Color(102, 0, 102));
        QuestionTextField.setForeground(new java.awt.Color(255, 255, 255));
        QuestionTextField.setText("jTextField1");
        QuestionTextField.setToolTipText("");

        QuestionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuestionLabel.setText("Q?:");

        javax.swing.GroupLayout QuestionPanelLayout = new javax.swing.GroupLayout(QuestionPanel);
        QuestionPanel.setLayout(QuestionPanelLayout);
        QuestionPanelLayout.setHorizontalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(QuestionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QuestionTextField)
                .addContainerGap())
        );
        QuestionPanelLayout.setVerticalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuestionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Opt2Panel.setBackground(new java.awt.Color(255, 255, 102));

        Option2RadioBtn.setText("jRadioButton2");
        Option2RadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2RadioBtnActionPerformed(evt);
            }
        });

        OptionBLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OptionBLabel.setText("B.");

        javax.swing.GroupLayout Opt2PanelLayout = new javax.swing.GroupLayout(Opt2Panel);
        Opt2Panel.setLayout(Opt2PanelLayout);
        Opt2PanelLayout.setHorizontalGroup(
            Opt2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt2PanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(OptionBLabel)
                .addGap(18, 18, 18)
                .addComponent(Option2RadioBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Opt2PanelLayout.setVerticalGroup(
            Opt2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt2PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Opt2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option2RadioBtn)
                    .addComponent(OptionBLabel))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        Opt1Panel.setBackground(new java.awt.Color(255, 255, 102));

        Option1RadioBtn.setText("jRadioButton1");

        OptionALabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OptionALabel.setText("A.");

        javax.swing.GroupLayout Opt1PanelLayout = new javax.swing.GroupLayout(Opt1Panel);
        Opt1Panel.setLayout(Opt1PanelLayout);
        Opt1PanelLayout.setHorizontalGroup(
            Opt1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OptionALabel)
                .addGap(17, 17, 17)
                .addComponent(Option1RadioBtn)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        Opt1PanelLayout.setVerticalGroup(
            Opt1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt1PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Opt1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option1RadioBtn)
                    .addComponent(OptionALabel))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Opt3Panel.setBackground(new java.awt.Color(255, 255, 102));

        Option3Radiobtn.setText("jRadioButton3");

        OptionCLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OptionCLabel.setText("C.");

        javax.swing.GroupLayout Opt3PanelLayout = new javax.swing.GroupLayout(Opt3Panel);
        Opt3Panel.setLayout(Opt3PanelLayout);
        Opt3PanelLayout.setHorizontalGroup(
            Opt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OptionCLabel)
                .addGap(18, 18, 18)
                .addComponent(Option3Radiobtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Opt3PanelLayout.setVerticalGroup(
            Opt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt3PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Opt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option3Radiobtn)
                    .addComponent(OptionCLabel))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Opt4Panel.setBackground(new java.awt.Color(255, 255, 102));

        Option4RadioBtn.setText("jRadioButton4");

        OptionDLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OptionDLabel.setText("D.");

        javax.swing.GroupLayout Opt4PanelLayout = new javax.swing.GroupLayout(Opt4Panel);
        Opt4Panel.setLayout(Opt4PanelLayout);
        Opt4PanelLayout.setHorizontalGroup(
            Opt4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt4PanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(OptionDLabel)
                .addGap(18, 18, 18)
                .addComponent(Option4RadioBtn)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        Opt4PanelLayout.setVerticalGroup(
            Opt4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt4PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Opt4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option4RadioBtn)
                    .addComponent(OptionDLabel))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        PreviousBttn.setBackground(new java.awt.Color(255, 255, 102));
        PreviousBttn.setText("Previous");

        NextBttn.setBackground(new java.awt.Color(255, 255, 102));
        NextBttn.setText("Next");

        CloseProgressReportbttn.setBackground(new java.awt.Color(255, 255, 102));
        CloseProgressReportbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/quizzify/close1.png"))); // NOI18N
        CloseProgressReportbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseProgressReportbttnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PreviousBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NextBttn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Opt1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Opt3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Opt4Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Opt2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseProgressReportbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseProgressReportbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opt2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Opt1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opt3Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Opt4Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Option2RadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2RadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option2RadioBtnActionPerformed

    private void CloseProgressReportbttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseProgressReportbttnMouseClicked
        this.dispose();
    }//GEN-LAST:event_CloseProgressReportbttnMouseClicked

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
            java.util.logging.Logger.getLogger(QuizCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseProgressReportbttn;
    private javax.swing.JButton NextBttn;
    private javax.swing.JPanel Opt1Panel;
    private javax.swing.JPanel Opt2Panel;
    private javax.swing.JPanel Opt3Panel;
    private javax.swing.JPanel Opt4Panel;
    private javax.swing.JRadioButton Option1RadioBtn;
    private javax.swing.JRadioButton Option2RadioBtn;
    private javax.swing.JRadioButton Option3Radiobtn;
    private javax.swing.JRadioButton Option4RadioBtn;
    private javax.swing.JLabel OptionALabel;
    private javax.swing.JLabel OptionBLabel;
    private javax.swing.JLabel OptionCLabel;
    private javax.swing.JLabel OptionDLabel;
    private javax.swing.JButton PreviousBttn;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JPanel QuestionPanel;
    private javax.swing.JTextField QuestionTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
