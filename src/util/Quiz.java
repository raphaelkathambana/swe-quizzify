/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author maya1
 */
public class Quiz {

    private List<Question> questions;
    private String subject;

    static GetConnection connection = GetConnection.getInstance();

    public Quiz() {
        questions = new ArrayList<>();
    }

    public Quiz(String subject) {
        questions = new ArrayList<>();
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addQuestion(Question question) {
        Logger.getLogger(Quiz.class.getName()).log(Level.INFO, "Question Added: {0}", question.getPrompt());
        Logger.getLogger(Quiz.class.getName()).log(Level.INFO, "{0} options added", question.getNumOptions());
        Logger.getLogger(Quiz.class.getName()).log(Level.INFO, "Options Added: {0}", question.getOptions());
        questions.add(question);
    }

    public Question getQuestion(int index) {
        return this.questions.get(index);
    }

    public int getNumQuestions() {
        return this.questions.size();
    }

    public String getQuestions() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            result.append("Question ").append(i + 1).append(": ").append(question.getQuestion()).append("\n");
            for (int j = 0; j < question.getNumOptions(); j++) {
                result.append("Option ").append(j + 1).append(": ").append(question.getOption(j)).append("\n");
            }
            result.append("Correct Answer: ").append(question.getCorrectAnswerIndex()).append("\n\n");
        }
        return result.toString();
    }

    // grade the quiz
    public int gradeQuiz(List<Integer> answers) {
        int score = 0;
        for (int i = 0; i < this.getNumQuestions(); i++) {
            Question question = this.getQuestion(i);
            if (question.getCorrectAnswerIndex() == answers.get(i)) {
                score++;
            }
        }
        return score;
    }

    // save to database
    public void saveQuiz(int teacherId) {
        Operation op = new Operation();
        op.saveQuizToDatabase(this, teacherId);
    }

    public int getQuizID() {
        Operation op = new Operation();
        return op.getQuizID();
    }
}
