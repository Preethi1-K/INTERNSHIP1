package com.xworkz.tostring;

import com.xworkz.tostring.toString.Exam;

public class ExamRunner {
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.setSubject("Mathematics");
        exam.setDate("2025-04-30");
        exam.setDuration(180);
        exam.setExaminer("Dr. Rao");

        System.out.println(exam.toString());
    }
}
