/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.List;

/**
 *
 * @author maya1
 */
public class Question {
    private String prompt;
    private List<String> options;
    private int correctAnswerIndex;
    private List<String> multimediaElements;

    public Question(String question, List<String> options, int correctAnswerIndex, List<String> multimediaElements) {
        this.prompt = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.multimediaElements = multimediaElements;
    }

    public Question(String questionText, List<String> options, int correctAnswerIndex) {
        this.prompt = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getPrompt() {
        return prompt;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public List<String> getMultimediaElements() {
        return multimediaElements;
    }

    public void addOption(String option) {
        options.add(option);
    }

    public void removeOption(int index) {
        options.remove(index);
    }

    public void addMultimediaElement(String multimediaElement) {
        multimediaElements.add(multimediaElement);
    }

    public void removeMultimediaElement(int index) {
        multimediaElements.remove(index);
    }

    public int getNumOptions() {
        return options.size();
    }

    public String getOption(int j) {
        return options.get(j);
    }

    public String getQuestion() {
        return this.prompt;
    }

    //to string method
    @Override
    public String toString() {
        return "Question{" + "prompt=" + prompt + ", options=" + options + ", correctAnswerIndex=" + correctAnswerIndex + ", multimediaElements=" + multimediaElements + '}';
    }

    //save to database
    public void saveToDatabase(int quizId) {
        //save question to database
        Operation.saveQuestionToDatabase(this, quizId);
    }
}
