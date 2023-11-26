/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzify;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import util.Operation;

import javax.swing.*;
/**
 *
 * @author bethe
 */
public class QuizStudMenu extends JInternalFrame {

    /**
     * Creates new form QuizStudMenu
     */
    Operation O = new Operation();

    String userType = "Stud";

    Color DefaultColour, ClickedColour, DefaultInnerColour, ClickedInnerColour;
    int count = 0;


    public QuizStudMenu() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);

        DefaultColour= new Color(230,196,70);
        DefaultInnerColour = new Color(230,208,112);
        ClickedColour = new Color(204,102,255);
        ClickedInnerColour= new Color(219,147,255);

        do {
            String[] Detail = O.quizStudDetal(count);
            if (count == 0) {
                QuizID1.setText("Quiz " + Detail[0]);
                Subject1.setText("Subject: " + Detail[1]);
                QuizBy1.setText("Quiz by: " + Detail[2]);
                Title1.setText("Title: " + Detail[3]);
            
            } else if (count == 1) {
                QuizID2.setText("Quiz " + Detail[0]);
                Subject2.setText("Subject: " + Detail[1]);
                QuizBy2.setText("Quiz by: " + Detail[2]);
                Title2.setText("Title: " + Detail[3]);
            
            } else if (count == 2) {
                QuizID3.setText("Quiz " + Detail[0]);
                Subject3.setText("Subject: " + Detail[1]);
                QuizBy3.setText("Quiz by: " + Detail[2]);
                Title3.setText("Title: " + Detail[3]);
            
            } else if (count == 3) {
                QuizID4.setText("Quiz " + Detail[0]);
                Subject4.setText("Subject: " + Detail[1]);
                QuizBy4.setText("Quiz by: " + Detail[2]);
                Title4.setText("Title: " + Detail[3]);
            }  

            count++;
        } while (count != 4);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PreviousButton = new javax.swing.JButton();
        QuizPanel1 = new javax.swing.JPanel();
        QuizID1 = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        QuizBy1 = new javax.swing.JLabel();
        Subject1 = new javax.swing.JLabel();
        QuizPanel2 = new javax.swing.JPanel();
        QuizBy2 = new javax.swing.JLabel();
        Subject2 = new javax.swing.JLabel();
        QuizID2 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        QuizPanel3 = new javax.swing.JPanel();
        QuizBy3 = new javax.swing.JLabel();
        Subject3 = new javax.swing.JLabel();
        QuizID3 = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();
        QuizPanel4 = new javax.swing.JPanel();
        QuizBy4 = new javax.swing.JLabel();
        Subject4 = new javax.swing.JLabel();
        QuizID4 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        NextButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PreviousButton.setBackground(new java.awt.Color(230, 196, 70));
        PreviousButton.setText("Previous");
        PreviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButtonActionPerformed(evt);
            }
        });

        QuizPanel1.setBackground(new java.awt.Color(230, 196, 70));
        QuizPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizPanel1MousePressed(evt);
            }
        });

        QuizID1.setBackground(new java.awt.Color(230, 208, 112));
        QuizID1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QuizID1.setText("No.");
        QuizID1.setOpaque(true);

        Title1.setBackground(new java.awt.Color(230, 208, 112));
        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setText("Title of the Quiz");
        Title1.setOpaque(true);

        QuizBy1.setBackground(new java.awt.Color(230, 208, 112));
        QuizBy1.setText("Quiz by: Teacher");
        QuizBy1.setOpaque(true);

        Subject1.setBackground(new java.awt.Color(230, 208, 112));
        Subject1.setText("Subject: Name");
        Subject1.setOpaque(true);

        javax.swing.GroupLayout QuizPanel1Layout = new javax.swing.GroupLayout(QuizPanel1);
        QuizPanel1.setLayout(QuizPanel1Layout);
        QuizPanel1Layout.setHorizontalGroup(
            QuizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuizPanel1Layout.createSequentialGroup()
                        .addComponent(QuizID1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QuizBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuizPanel1Layout.setVerticalGroup(
            QuizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(QuizID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subject1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        QuizPanel2.setBackground(new java.awt.Color(230, 196, 70));
        QuizPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizPanel2MousePressed(evt);
            }
        });

        QuizBy2.setBackground(new java.awt.Color(230, 208, 112));
        QuizBy2.setText("Quiz by: Teacher");
        QuizBy2.setOpaque(true);

        Subject2.setBackground(new java.awt.Color(230, 208, 112));
        Subject2.setText("Subject: Name");
        Subject2.setOpaque(true);

        QuizID2.setBackground(new java.awt.Color(230, 208, 112));
        QuizID2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QuizID2.setText("No.");
        QuizID2.setOpaque(true);

        Title2.setBackground(new java.awt.Color(230, 208, 112));
        Title2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title2.setText("Title of the Quiz");
        Title2.setOpaque(true);

        javax.swing.GroupLayout QuizPanel2Layout = new javax.swing.GroupLayout(QuizPanel2);
        QuizPanel2.setLayout(QuizPanel2Layout);
        QuizPanel2Layout.setHorizontalGroup(
            QuizPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuizPanel2Layout.createSequentialGroup()
                        .addComponent(QuizID2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QuizBy2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuizPanel2Layout.setVerticalGroup(
            QuizPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(QuizID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizBy2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subject2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        QuizPanel3.setBackground(new java.awt.Color(230, 196, 70));
        QuizPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizPanel3MousePressed(evt);
            }
        });

        QuizBy3.setBackground(new java.awt.Color(230, 208, 112));
        QuizBy3.setText("Quiz by: Teacher");
        QuizBy3.setOpaque(true);

        Subject3.setBackground(new java.awt.Color(230, 208, 112));
        Subject3.setText("Subject: Name");
        Subject3.setOpaque(true);

        QuizID3.setBackground(new java.awt.Color(230, 208, 112));
        QuizID3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QuizID3.setText("No.");
        QuizID3.setOpaque(true);

        Title3.setBackground(new java.awt.Color(230, 208, 112));
        Title3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title3.setText("Title of the Quiz");
        Title3.setOpaque(true);

        javax.swing.GroupLayout QuizPanel3Layout = new javax.swing.GroupLayout(QuizPanel3);
        QuizPanel3.setLayout(QuizPanel3Layout);
        QuizPanel3Layout.setHorizontalGroup(
            QuizPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuizPanel3Layout.createSequentialGroup()
                        .addComponent(QuizID3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Title3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QuizBy3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuizPanel3Layout.setVerticalGroup(
            QuizPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(QuizID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizBy3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subject3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        QuizPanel4.setBackground(new java.awt.Color(230, 196, 70));
        QuizPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QuizPanel4MousePressed(evt);
            }
        });

        QuizBy4.setBackground(new java.awt.Color(230, 208, 112));
        QuizBy4.setText("Quiz by: Teacher");
        QuizBy4.setOpaque(true);

        Subject4.setBackground(new java.awt.Color(230, 208, 112));
        Subject4.setText("Subject: Name");
        Subject4.setOpaque(true);

        QuizID4.setBackground(new java.awt.Color(230, 208, 112));
        QuizID4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QuizID4.setText("No.");
        QuizID4.setOpaque(true);

        Title4.setBackground(new java.awt.Color(230, 208, 112));
        Title4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title4.setText("Title of the Quiz");
        Title4.setOpaque(true);

        javax.swing.GroupLayout QuizPanel4Layout = new javax.swing.GroupLayout(QuizPanel4);
        QuizPanel4.setLayout(QuizPanel4Layout);
        QuizPanel4Layout.setHorizontalGroup(
            QuizPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuizPanel4Layout.createSequentialGroup()
                        .addComponent(QuizID4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Title4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QuizBy4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuizPanel4Layout.setVerticalGroup(
            QuizPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuizPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QuizPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Title4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(QuizID4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuizBy4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subject4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NextButton.setBackground(new java.awt.Color(230, 196, 70));
        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(230, 196, 70));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("DO QUIZ!!");

        jPanel2.setBackground(new java.awt.Color(204, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Quizzify Menu");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel2.setText("Select the Quiz you want to do!!");

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(254, 254, 254))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PreviousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(QuizPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuizPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(QuizPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuizPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(QuizPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuizPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(QuizPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuizPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PreviousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuizPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizPanel1MousePressed
        QuizPanel1.setBackground(ClickedColour);
        QuizPanel2.setBackground(DefaultColour);
        QuizPanel3.setBackground(DefaultColour);
        QuizPanel4.setBackground(DefaultColour);
        
        QuizBy1.setBackground(ClickedInnerColour);
        Title1.setBackground(ClickedInnerColour);
        Subject1.setBackground(ClickedInnerColour);
        QuizID1.setBackground(ClickedInnerColour);

        QuizBy2.setBackground(DefaultInnerColour);
        Title2.setBackground(DefaultInnerColour);
        Subject2.setBackground(DefaultInnerColour);
        QuizID2.setBackground(DefaultInnerColour);

        QuizBy3.setBackground(DefaultInnerColour);
        Title3.setBackground(DefaultInnerColour);
        Subject3.setBackground(DefaultInnerColour);
        QuizID3.setBackground(DefaultInnerColour);

        QuizBy4.setBackground(DefaultInnerColour);
        Title4.setBackground(DefaultInnerColour);
        Subject4.setBackground(DefaultInnerColour);
        QuizID4.setBackground(DefaultInnerColour);
    }//GEN-LAST:event_QuizPanel1MousePressed

    private void QuizPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizPanel2MousePressed
        QuizPanel1.setBackground(DefaultColour);
        QuizPanel2.setBackground(ClickedColour);
        QuizPanel3.setBackground(DefaultColour);
        QuizPanel4.setBackground(DefaultColour);

        QuizBy1.setBackground(DefaultInnerColour);
        Title1.setBackground(DefaultInnerColour);
        Subject1.setBackground(DefaultInnerColour);
        QuizID1.setBackground(DefaultInnerColour);

        QuizBy2.setBackground(ClickedInnerColour);
        Title2.setBackground(ClickedInnerColour);
        Subject2.setBackground(ClickedInnerColour);
        QuizID2.setBackground(ClickedInnerColour);

        QuizBy3.setBackground(DefaultInnerColour);
        Title3.setBackground(DefaultInnerColour);
        Subject3.setBackground(DefaultInnerColour);
        QuizID3.setBackground(DefaultInnerColour);

        QuizBy4.setBackground(DefaultInnerColour);
        Title4.setBackground(DefaultInnerColour);
        Subject4.setBackground(DefaultInnerColour);
        QuizID4.setBackground(DefaultInnerColour);
    }//GEN-LAST:event_QuizPanel2MousePressed

    private void QuizPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizPanel3MousePressed
        QuizPanel1.setBackground(DefaultColour);
        QuizPanel2.setBackground(DefaultColour);
        QuizPanel3.setBackground(ClickedColour);
        QuizPanel4.setBackground(DefaultColour);

        QuizBy1.setBackground(DefaultInnerColour);
        Title1.setBackground(DefaultInnerColour);
        Subject1.setBackground(DefaultInnerColour);
        QuizID1.setBackground(DefaultInnerColour);

        QuizBy2.setBackground(DefaultInnerColour);
        Title2.setBackground(DefaultInnerColour);
        Subject2.setBackground(DefaultInnerColour);
        QuizID2.setBackground(DefaultInnerColour);

        QuizBy3.setBackground(ClickedInnerColour);
        Title3.setBackground(ClickedInnerColour);
        Subject3.setBackground(ClickedInnerColour);
        QuizID3.setBackground(ClickedInnerColour);

        QuizBy4.setBackground(DefaultInnerColour);
        Title4.setBackground(DefaultInnerColour);
        Subject4.setBackground(DefaultInnerColour);
        QuizID4.setBackground(DefaultInnerColour);
    }//GEN-LAST:event_QuizPanel3MousePressed

    private void QuizPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuizPanel4MousePressed
        QuizPanel1.setBackground(DefaultColour);
        QuizPanel2.setBackground(DefaultColour);
        QuizPanel3.setBackground(DefaultColour);
        QuizPanel4.setBackground(ClickedColour);

        QuizBy1.setBackground(DefaultInnerColour);
        Title1.setBackground(DefaultInnerColour);
        Subject1.setBackground(DefaultInnerColour);
        QuizID1.setBackground(DefaultInnerColour);
        
        QuizBy2.setBackground(DefaultInnerColour);
        Title2.setBackground(DefaultInnerColour);
        Subject2.setBackground(DefaultInnerColour);
        QuizID2.setBackground(DefaultInnerColour);

        QuizBy3.setBackground(DefaultInnerColour);
        Title3.setBackground(DefaultInnerColour);
        Subject3.setBackground(DefaultInnerColour);
        QuizID3.setBackground(DefaultInnerColour);

        QuizBy4.setBackground(ClickedInnerColour);
        Title4.setBackground(ClickedInnerColour);
        Subject4.setBackground(ClickedInnerColour);
        QuizID4.setBackground(ClickedInnerColour);
    }//GEN-LAST:event_QuizPanel4MousePressed

    private void PreviousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousButtonActionPerformed
        if (count == 4){
            JOptionPane.showMessageDialog(this, "No more Quizes!");
        }
        else {
            int n = count;
            count = count - 8;

            do {
                String[] Detail = O.quizStudDetal(count);
                if (count == n - 8) {
                    QuizID1.setText("Quiz " + Detail[0]);
                    Subject1.setText("Subject: " + Detail[1]);
                    QuizBy1.setText("Quiz by: " + Detail[2]);
                    Title1.setText("Title: " + Detail[3]);
                    
                } else if (count == n - 7) {
                    QuizID2.setText("Quiz " + Detail[0]);
                    Subject2.setText("Subject: " + Detail[1]);
                    QuizBy2.setText("Quiz by: " + Detail[2]);
                    Title2.setText("Title: " + Detail[3]);
                    
                } else if (count == n - 6) {
                    QuizID3.setText("Quiz " + Detail[0]);
                    Subject3.setText("Subject: " + Detail[1]);
                    QuizBy3.setText("Quiz by: " + Detail[2]);
                    Title3.setText("Title: " + Detail[3]);
                    
                } else if (count == n - 5) {
                    QuizID4.setText("Quiz " + Detail[0]);
                    Subject4.setText("Subject: " + Detail[1]);
                    QuizBy4.setText("Quiz by: " + Detail[2]);
                    Title4.setText("Title: " + Detail[3]);
                }  

                count++;
            } while (count != n-4);
        }
    }//GEN-LAST:event_PreviousButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed

        int NumQuiz = O.num("SELECT COUNT(*) FROM `Quiz`");
        if (NumQuiz <= count){
            JOptionPane.showMessageDialog(this, "No more Quizes!");
        } 
        else {
            int n = count;

            do {
                String[] Detail = O.quizStudDetal(count);
                if (count == n + 0) {
                    QuizID1.setText("Quiz " + Detail[0]);
                    Subject1.setText("Subject: " + Detail[1]);
                    QuizBy1.setText("Quiz by: " + Detail[2]);
                    Title1.setText("Title: " + Detail[3]);
                    
                } else if (count == n + 1) {
                    QuizID2.setText("Quiz " + Detail[0]);
                    Subject2.setText("Subject: " + Detail[1]);
                    QuizBy2.setText("Quiz by: " + Detail[2]);
                    Title2.setText("Title: " + Detail[3]);
                    
                } else if (count == n + 2) {
                    QuizID3.setText("Quiz " + Detail[0]);
                    Subject3.setText("Subject: " + Detail[1]);
                    QuizBy3.setText("Quiz by: " + Detail[2]);
                    Title3.setText("Title: " + Detail[3]);
                    
                } else if (count == n + 3) {
                    QuizID4.setText("Quiz " + Detail[0]);
                    Subject4.setText("Subject: " + Detail[1]);
                    QuizBy4.setText("Quiz by: " + Detail[2]);
                    Title4.setText("Title: " + Detail[3]);
                }  

                count++;
            } while (count != n + 4 );
        }
    }//GEN-LAST:event_NextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(QuizStudMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizStudMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizStudMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizStudMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizStudMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NextButton;
    private javax.swing.JButton PreviousButton;
    private javax.swing.JLabel QuizBy1;
    private javax.swing.JLabel QuizBy2;
    private javax.swing.JLabel QuizBy3;
    private javax.swing.JLabel QuizBy4;
    private javax.swing.JLabel QuizID1;
    private javax.swing.JLabel QuizID2;
    private javax.swing.JLabel QuizID3;
    private javax.swing.JLabel QuizID4;
    private javax.swing.JPanel QuizPanel1;
    private javax.swing.JPanel QuizPanel2;
    private javax.swing.JPanel QuizPanel3;
    private javax.swing.JPanel QuizPanel4;
    private javax.swing.JLabel Subject1;
    private javax.swing.JLabel Subject2;
    private javax.swing.JLabel Subject3;
    private javax.swing.JLabel Subject4;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
