package skuniv.ac.kr.quickpollapplication.UI;

import android.graphics.drawable.Drawable;

/**
 * Created by oopsla on 2017-10-18.
 */

public class CourseItem {
    private Drawable credit, sendBtn;
    private String courseName;
    private String date;

    public Drawable getCredit() {
        return credit;
    }

    public void setCredit(Drawable credit) {
        this.credit = credit;
    }

    public Drawable getSendBtn() {
        return sendBtn;
    }

    public void setSendBtn(Drawable sendBtn) {
        this.sendBtn = sendBtn;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
