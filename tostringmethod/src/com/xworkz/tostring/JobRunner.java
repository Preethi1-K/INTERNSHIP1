package com.xworkz.tostring;

import com.xworkz.tostring.toString.Job;

public class JobRunner {
    public static void main(String[] args) {
        Job job = new Job();
        job.setTitle("Software Engineer");
        job.setCompany("Google");
        job.setSalary(120000);
        job.setLocation("Mountain View, CA");
        job.setDepartment("Engineering");

        System.out.println(job.toString());
    }
}
