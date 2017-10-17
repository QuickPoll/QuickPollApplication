package skuniv.ac.kr.quickpollapplication;

/**
 * Created by gunyoungkim on 2017-10-18.
 */

public class RankingData {
    private int ranking;
    private  String student_name;
    private int question;
    private int correct;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }
}
