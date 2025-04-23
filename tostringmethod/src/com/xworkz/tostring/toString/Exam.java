package com.xworkz.tostring.toString;

public class Exam {

    private String subject;
    private String date;
    private int duration;
    private String examiner;

    public Exam() {
    }
@Override
    public String toString() {
        return "Exam:(subject:" + this.subject + ",\n date:" + this.date + ",\n duration:" + this.duration + ",\n examiner:" + this.examiner + ")";
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return date;
    }

    public int getDuration() {
        return duration;
    }

    public String getExaminer() {
        return examiner;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner;
    }
}
