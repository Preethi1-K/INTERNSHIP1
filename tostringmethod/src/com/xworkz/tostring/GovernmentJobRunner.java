package com.xworkz.tostring;

import com.xworkz.tostring.toString.GovernmentJob;

public class GovernmentJobRunner {
    public static void main(String[] args) {
        GovernmentJob govtJob = new GovernmentJob();
        govtJob.setJobTitle("Teacher");
        govtJob.setDepartment("Education");
        govtJob.setSalary(50000.0);
        govtJob.setLocation("Delhi");
        govtJob.setQualificationRequired("Master's Degree");

        System.out.println(govtJob.toString());
    }
}
