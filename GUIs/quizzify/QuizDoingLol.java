/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizzify;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;
import util.Question;
import util.Quiz;

/**
 *
 * @author JC
 */
public class QuizDoingLol extends javax.swing.JFrame {

    private JRadioButton[] optionRadioButtons;
    private Quiz quiz;
    private int timeRemaining;
    private Timer timer;
    private int currentQuestionIndex;
    private List<Integer> answers;

    /**
     * Creates new form QuizDoingLol
     */
    public QuizDoingLol() {
        initComponents();
        this.answers = new ArrayList<>();

        timer = new Timer(1000, e -> {
            timeRemaining--;
            timerLabel.setText("Time Remaining: " + timeRemaining + " seconds");
            Logger.getLogger(QuizDoingLol.class.getName()).log(Level.INFO, "time: {0}", timeRemaining);
            if (timeRemaining <= 0) {
                Logger.getLogger(QuizTakingUI.class.getName()).info("Timer Stopped");
                showNextQuestion();
            }
        });

        startQuiz();
    }

    public QuizDoingLol(Quiz quiz) {
        initComponents();
        this.quiz = quiz;
        this.currentQuestionIndex = 0;
        this.answers = new ArrayList<>();
        this.timeRemaining = 60; // 60 seconds for each question

        timer = new Timer(1000, e -> {
            timeRemaining--;
            timerLabel.setText("Time Remaining: " + timeRemaining + " seconds");
            Logger.getLogger(QuizTakingUI.class.getName()).log(Level.INFO, "time: {0}", timeRemaining);
            if (timeRemaining <= 0) {
                Logger.getLogger(QuizTakingUI.class.getName()).info("Timer Stopped");
                showNextQuestion();
            }
        });

        startQuiz();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionGroup = new javax.swing.ButtonGroup();
        quizPanel = new javax.swing.JPanel();
        QuestionPanel = new javax.swing.JPanel();
        QuestionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Opt2Panel = new javax.swing.JPanel();
        Option2RadioBtn = new javax.swing.JRadioButton();
        OptionBLabel = new javax.swing.JLabel();
        Opt1Panel = new javax.swing.JPanel();
        Option1RadioBtn = new javax.swing.JRadioButton();
        OptionALabel = new javax.swing.JLabel();
        Opt3Panel = new javax.swing.JPanel();
        Option3RadioBtn = new javax.swing.JRadioButton();
        OptionCLabel = new javax.swing.JLabel();
        Opt4Panel = new javax.swing.JPanel();
        Option4RadioBtn = new javax.swing.JRadioButton();
        OptionDLabel = new javax.swing.JLabel();
        PreviousBttn = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        CloseProgressReportbttn = new javax.swing.JButton();
        timerLabel = new javax.swing.JLabel();
        optionGroup.add(Option1RadioBtn);
        optionGroup.add(Option2RadioBtn);
        optionGroup.add(Option3RadioBtn);
        optionGroup.add(Option4RadioBtn);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        quizPanel.setBackground(new java.awt.Color(102, 0, 102));

        QuestionPanel.setBackground(new java.awt.Color(255, 255, 102));

        QuestionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        QuestionLabel.setText("Q?:");

        jLabel1.setBackground(new java.awt.Color(102, 0, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout QuestionPanelLayout = new javax.swing.GroupLayout(QuestionPanel);
        QuestionPanel.setLayout(QuestionPanelLayout);
        QuestionPanelLayout.setHorizontalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(QuestionLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuestionPanelLayout.setVerticalGroup(
            QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(QuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Opt2Panel.setBackground(new java.awt.Color(255, 255, 102));

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
                .addContainerGap(86, Short.MAX_VALUE))
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
                .addComponent(Option3RadioBtn)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        Opt3PanelLayout.setVerticalGroup(
            Opt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Opt3PanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Opt3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Option3RadioBtn)
                    .addComponent(OptionCLabel))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Opt4Panel.setBackground(new java.awt.Color(255, 255, 102));

        Option4RadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option4RadioBtnActionPerformed(evt);
            }
        });

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
        PreviousBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousBttnActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(255, 255, 102));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        CloseProgressReportbttn.setBackground(new java.awt.Color(255, 255, 102));
        CloseProgressReportbttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/images-removebg-preview.png"))); // NOI18N
        CloseProgressReportbttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseProgressReportbttnMouseClicked(evt);
            }
        });
        CloseProgressReportbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseProgressReportbttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quizPanelLayout = new javax.swing.GroupLayout(quizPanel);
        quizPanel.setLayout(quizPanelLayout);
        quizPanelLayout.setHorizontalGroup(
            quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quizPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CloseProgressReportbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(quizPanelLayout.createSequentialGroup()
                        .addGroup(quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(quizPanelLayout.createSequentialGroup()
                                .addComponent(PreviousBttn)
                                .addGap(144, 144, 144)
                                .addComponent(timerLabel))
                            .addGroup(quizPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Opt3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Opt1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Opt2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Opt4Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(13, 13, 13))
                    .addComponent(QuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        quizPanelLayout.setVerticalGroup(
            quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quizPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseProgressReportbttn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Opt2Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Opt1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Opt4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Opt3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(quizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quizPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quizPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Option4RadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option4RadioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Option4RadioBtnActionPerformed

    private void Option2RadioBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Option2RadioBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Option2RadioBtnActionPerformed

    private void CloseProgressReportbttnMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_CloseProgressReportbttnMouseClicked
        this.dispose(); // TODO add your handling code here:
    }// GEN-LAST:event_CloseProgressReportbttnMouseClicked

    private void CloseProgressReportbttnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CloseProgressReportbttnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_CloseProgressReportbttnActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nextButtonActionPerformed
        int selectedOptionIndex = getSelectedOptionIndex();
        int correctAnswerIndex = quiz.getQuestion(currentQuestionIndex).getCorrectAnswerIndex();
        answers.add(selectedOptionIndex);

        currentQuestionIndex++;

        if (currentQuestionIndex < quiz.getNumQuestions()) {
            nextButton.setEnabled(false);
            processAnswer(selectedOptionIndex, correctAnswerIndex);
            updateQuestion();
        } else {
            JOptionPane.showMessageDialog(this, "Quiz Completed");
            showNextQuestion();
        }
    }// GEN-LAST:event_nextButtonActionPerformed

    private void PreviousBttnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PreviousBttnActionPerformed
        currentQuestionIndex--;
        updateQuestion();
    }// GEN-LAST:event_PreviousBttnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizDoingLol.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }   
        // </editor-fold>

        /* Create and display the form */
        Quiz quiz = new Quiz();
        quiz.setSubject("Science");
        quiz.saveQuiz(1);
        Question question1 = new Question("What is the capital of France?",
                List.of("London", "Berlin", "Paris", "else"), 2);
        Question question2 = new Question("Which planet is known as the Red Planet?",
                List.of("Earth", "Mars", "Venus", "else"),
                1);
        List<String> optionsForQuestion3 = new ArrayList<>();
        optionsForQuestion3.add("Jupiter");
        optionsForQuestion3.add("Saturn");
        optionsForQuestion3.add("Mars");
        optionsForQuestion3.add("Uranus");

        Question question3 = new Question("What is the largest planet in our solar system?", optionsForQuestion3, 0);
        question1.saveToDatabase(quiz.getQuizID());
        quiz.addQuestion(question1);
        question2.saveToDatabase(quiz.getQuizID());
        quiz.addQuestion(question2);
        question3.saveToDatabase(quiz.getQuizID());
        quiz.addQuestion(question3);

        java.awt.EventQueue.invokeLater(() -> new QuizDoingLol(quiz).setVisible(true));
    }

    private void processAnswer(int selectedOptionIndex, int correctAnswerIndex) {
        if (optionGroup.getSelection() != null) {
            if (selectedOptionIndex == correctAnswerIndex) {
                JOptionPane.showMessageDialog(this, "Correct!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect!");
            }
            nextButton.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseProgressReportbttn;
    private javax.swing.JPanel Opt1Panel;
    private javax.swing.JPanel Opt2Panel;
    private javax.swing.JPanel Opt3Panel;
    private javax.swing.JPanel Opt4Panel;
    private javax.swing.JRadioButton Option1RadioBtn;
    private javax.swing.JRadioButton Option2RadioBtn;
    private javax.swing.JRadioButton Option3RadioBtn;
    private javax.swing.JRadioButton Option4RadioBtn;
    private javax.swing.JLabel OptionALabel;
    private javax.swing.JLabel OptionBLabel;
    private javax.swing.JLabel OptionCLabel;
    private javax.swing.JLabel OptionDLabel;
    private javax.swing.JButton PreviousBttn;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JPanel QuestionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextButton;
    private javax.swing.ButtonGroup optionGroup;
    private javax.swing.JPanel quizPanel;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables

    public void startQuiz() {
        updateQuestion();
        timer.start();
        this.setVisible(true);
    }

    private void showNextQuestion() {
        if (currentQuestionIndex >= quiz.getNumQuestions()) {
            timer.stop();
            int score = quiz.gradeQuiz(answers);
            JOptionPane.showMessageDialog(this,
                    "Your score is: " + score + "/" + quiz.getNumQuestions());
            this.dispose();
        }
    }

    private void updateQuestion() {
        Question currentQuestion = quiz.getQuestion(currentQuestionIndex);
        QuestionLabel.setText(currentQuestion.getPrompt());

        if (optionRadioButtons != null) {
            for (int i = 0; i < optionRadioButtons.length; i++) {
                optionGroup.remove(optionRadioButtons[i]);
                quizPanel.remove(optionRadioButtons[i]);
            }
        }

        optionRadioButtons = new JRadioButton[currentQuestion.getNumOptions()];

        for (int i = 0; i < currentQuestion.getNumOptions(); i++) {
            addQuestions(i, currentQuestion.getOption(i));
        }

        optionGroup.clearSelection();
        this.revalidate();
        Logger.getLogger(QuizTakingUI.class.getName()).log(Level.INFO, "Question Updated");
    }

    private void addQuestions(int i, String option) {
        switch (i) {
            case 0:
                Option1RadioBtn.setText(option);
                optionRadioButtons[i] = Option1RadioBtn;
                optionGroup.add(optionRadioButtons[i]);
                break;
            case 1:
                Option2RadioBtn.setText(option);
                optionRadioButtons[i] = Option2RadioBtn;
                optionGroup.add(optionRadioButtons[i]);
                break;
            case 2:
                Option3RadioBtn.setText(option);
                optionRadioButtons[i] = Option3RadioBtn;
                optionGroup.add(optionRadioButtons[i]);
                break;
            case 3:
                Option4RadioBtn.setText(option);
                optionRadioButtons[i] = Option4RadioBtn;
                optionGroup.add(optionRadioButtons[i]);
                break;
            default:
                break;
        }
    }

    private int getSelectedOptionIndex() {
        for (int i = 0; i < optionRadioButtons.length; i++) {
            if (optionRadioButtons[i].isSelected()) {
                return i;
            }
        }
        return -1;
    }
}
