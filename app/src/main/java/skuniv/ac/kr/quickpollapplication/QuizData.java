package skuniv.ac.kr.quickpollapplication;

/**
 * Created by gunyoungkim on 2017-10-17.
 */

public class QuizData {
    private String question_date;
    private String question_content;
    private int question_type; //2 -> objective_question 3 -> subjective_question 4 -> O/X

    public String getQuestion_date() {
        return question_date;
    }

    public void setQuestion_date(String question_date) {
        this.question_date = question_date;
    }

    public String getQuestion_content() {
        return question_content;
    }

    public void setQuestion_content(String question_content) {
        this.question_content = question_content;
    }

    public int getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(int question_type) {
        this.question_type = question_type;
    }
}
