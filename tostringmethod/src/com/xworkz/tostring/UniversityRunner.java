package com.xworkz.tostring;

import com.xworkz.tostring.toString.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new University();
        university.setName("Harvard University");
        university.setLocation("Cambridge, MA");
        university.setEstablishedYear(1636);
        university.setNumberOfDepartments(50);
        university.setRank("1st");

        System.out.println(university.toString());
    }
}
