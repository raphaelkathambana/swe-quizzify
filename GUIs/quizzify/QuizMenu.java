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
public class QuizMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuizMenu
     */
    public QuizMenu() {
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

        QuizMenuLabel = new javax.swing.JLabel();
        QuizScreen = new javax.swing.JDesktopPane();
        CreateQuizPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ViewQuizPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 51));

        QuizMenuLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        QuizMenuLabel.setText("Quiz Menu");

        QuizScreen.setBackground(new java.awt.Color(255, 255, 51));
        QuizScreen.setPreferredSize(new java.awt.Dimension(778, 522));

        javax.swing.GroupLayout QuizScreenLayout = new javax.swing.GroupLayout(QuizScreen);
        QuizScreen.setLayout(QuizScreenLayout);
        QuizScreenLayout.setHorizontalGroup(
            QuizScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        QuizScreenLayout.setVerticalGroup(
            QuizScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        CreateQuizPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateQuizPanelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Create Quiz");

        javax.swing.GroupLayout CreateQuizPanelLayout = new javax.swing.GroupLayout(CreateQuizPanel);
        CreateQuizPanel.setLayout(CreateQuizPanelLayout);
        CreateQuizPanelLayout.setHorizontalGroup(
            CreateQuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateQuizPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        CreateQuizPanelLayout.setVerticalGroup(
            CreateQuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateQuizPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        ViewQuizPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewQuizPanelMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("View Quizes");

        javax.swing.GroupLayout ViewQuizPanelLayout = new javax.swing.GroupLayout(ViewQuizPanel);
        ViewQuizPanel.setLayout(ViewQuizPanelLayout);
        ViewQuizPanelLayout.setHorizontalGroup(
            ViewQuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewQuizPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewQuizPanelLayout.setVerticalGroup(
            ViewQuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewQuizPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewQuizPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateQuizPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QuizMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuizScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuizMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateQuizPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewQuizPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(316, Short.MAX_VALUE))
                    .addComponent(QuizScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateQuizPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateQuizPanelMouseClicked
        // TODO add your handling code here:
        CreateQuiz create = new CreateQuiz();
        QuizScreen.removeAll();
        QuizScreen.add(create).setVisible(true);
    }//GEN-LAST:event_CreateQuizPanelMouseClicked

    private void ViewQuizPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewQuizPanelMouseClicked
        // TODO add your handling code here:
        ViewQuiz view = new ViewQuiz();
        QuizScreen.removeAll();
        QuizScreen.add(view).setVisible(true);
    }//GEN-LAST:event_ViewQuizPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateQuizPanel;
    private javax.swing.JLabel QuizMenuLabel;
    private javax.swing.JDesktopPane QuizScreen;
    private javax.swing.JPanel ViewQuizPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
