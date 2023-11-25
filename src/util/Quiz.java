/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maya1
 */
public class Quiz {

    private List<Question> questions;
    private String subject;

    GetConnection connection = GetConnection.getInstance();

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
        try (
                Connection conn = GetConnection.getInstance().getConnection();
                Statement stmt = conn.createStatement();) {
            // get subject id
            ResultSet rs = stmt.executeQuery("SELECT * FROM subject WHERE `Name` = '" + this.subject + "';");
            rs.next();
            int subjectId = rs.getInt(1);
            // insert quiz into database
            stmt.executeUpdate("INSERT INTO quiz (Subject_ID, Teacher_ID) VALUES (" + subjectId + ", " + teacherId + ");");
            Logger.getLogger(Quiz.class.getName()).info("Quiz saved to database");
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        int id = 0;
        try (
                Connection conn = GetConnection.getInstance().getConnection();
                Statement stmt = conn.createStatement();) {
            // get subject id
            ResultSet rs = stmt.executeQuery("SELECT * FROM quiz WHERE `Subject_ID` = (SELECT ID FROM subject WHERE `Name` = '" + this.subject + "');");
            rs.next();
            id = rs.getInt(1);
            Logger.getLogger(Quiz.class.getName()).info("Quiz id returned");
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public int getQuizID() {

        int LatestQuizID = 0;
        String query = "";

        Statement Stat;
        ResultSet rs;

            query = "SELECT Quiz_ID FROM Quiz WHERE Quiz_ID = (select max(Quiz_ID) from Quiz);";

        try {
            Stat = connection.getConnection().createStatement();
            rs = Stat.executeQuery(query);
            while (rs.next())
                LatestQuizID = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Error: Couldn't find number of user");
        }


        return LatestQuizID;
    }
}
