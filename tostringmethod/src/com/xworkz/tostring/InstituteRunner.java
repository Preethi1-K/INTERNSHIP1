package com.xworkz.tostring;

import com.xworkz.tostring.toString.Institute;

public class InstituteRunner {
    public static void main(String[] args) {
        Institute institute = new Institute();
        institute.setName("MIT");
        institute.setLocation("Cambridge, MA");
        institute.setCoursesOffered("Engineering, Computer Science");
        institute.setEstablishedYear(1861);
        institute.setAccreditation("ABET");

        System.out.println(institute.toString());
    }
}
