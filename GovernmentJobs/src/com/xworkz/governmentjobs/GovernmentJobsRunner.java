package com.xworkz.governmentjobs;
import com.xworkz.governmentjobs.jobshub.GovernmentJobs;

public class GovernmentJobsRunner {


    private String jobTitle;
    private String department;
    private String location;
    private double salary;
    private String qualification;
    private int ageLimit;
    private boolean isPermanent;



    public static void main(String arg[])
    {
        GovernmentJobs position=new GovernmentJobs();
         position.setJobTitle("IAS Officer");
         position.setDepartment("Administrative Services");
         position.setLocation("Delhi");
         position.setSalary( 156000.00);
         position.setQualification("Graduate + UPSC");
         position.setAgelimit( 32);
         position.setIspermanent(true);


       String job1=  position.getJobTitle();
       String department1 = position.getDepartment();
       String location1= position.getLocation();
       double salary1= position.getSalary();
       String qualification1=position.getQualification();
       int agelimit1= position.getAgelimit();
       boolean ispermenent1=position.getIspermanent();

       System.out.println("The job tile is"+job1);
       System.out.println("The job department is"+department1);
       System.out.println("The job location is"+location1);
       System.out.println("The job  salary is "+salary1);
       System.out.println("The qualification of job is"+qualification1);
       System.out.println("The age limit of job is"+agelimit1);
       System.out.println("The job is permanet or not"+ispermenent1);



        GovernmentJobs roles=new GovernmentJobs();
        roles.setJobTitle("Police Sub-Inspector");
        roles.setDepartment("Police Department");
        roles.setLocation("Mumbai");
        roles.setSalary( 65000.00);
        roles.setQualification("Graduate + Exam");
        roles.setAgelimit(28);
        roles.setIspermanent(true);


        String job2=  roles.getJobTitle();
        String department2= roles.getDepartment();
        String location2= roles.getLocation();
        double salary2= roles.getSalary();
        String qualification2=roles.getQualification();
        int agelimit2= roles.getAgelimit();
        boolean ispermenent2=roles.getIspermanent();

        System.out.println("The job tile is"+job2);
        System.out.println("The job department is"+department2);
        System.out.println("The job location is"+location2);
        System.out.println("The job  salary is "+salary2);
        System.out.println("The qualification of job is"+qualification2);
        System.out.println("The age limit of job is"+agelimit2);
        System.out.println("The job is permanet or not"+ispermenent2);


        GovernmentJobs occupations=new GovernmentJobs();
        occupations.setJobTitle("Forest Ranger");
        occupations.setDepartment("Forest Department");
        occupations.setLocation("Kerala");
        occupations.setSalary(52000.00);
        occupations.setQualification("Science Graduate");
        occupations.setAgelimit(30);
        occupations.setIspermanent(true);


        String job3=  occupations.getJobTitle();
        String department3 = occupations.getDepartment();
        String location3= occupations.getLocation();
        double salary3= occupations.getSalary();
        String qualification3=occupations.getQualification();
        int agelimit3= occupations.getAgelimit();
        boolean ispermenent3=occupations.getIspermanent();

        System.out.println("The job tile is"+job3);
        System.out.println("The job department is"+department3);
        System.out.println("The job location is"+location3);
        System.out.println("The job  salary is "+salary3);
        System.out.println("The qualification of job is"+qualification3);
        System.out.println("The age limit of job is"+agelimit3);
        System.out.println("The job is permanet or not"+ispermenent3);



        GovernmentJobs professions=new GovernmentJobs();
        professions.setJobTitle("Junior Engineer");
        professions.setDepartment("Public Works Department");
        professions.setLocation("Bangalore");
        professions.setSalary(45000.00);
        professions.setQualification("Diploma in Engineering");
        professions.setAgelimit(27);
        professions.setIspermanent(true);


        String job4=  professions.getJobTitle();
        String department4 = professions.getDepartment();
        String location4= professions.getLocation();
        double salary4= professions.getSalary();
        String qualification4=professions.getQualification();
        int agelimit4= professions.getAgelimit();
        boolean ispermenent4=professions.getIspermanent();

        System.out.println("The job tile is"+job4);
        System.out.println("The job department is"+department4);
        System.out.println("The job location is"+location4);
        System.out.println("The job  salary is "+salary4);
        System.out.println("The qualification of job is"+qualification4);
        System.out.println("The age limit of job is"+agelimit4);
        System.out.println("The job is permanet or not"+ispermenent4);



        GovernmentJobs careers=new GovernmentJobs();
        careers.setJobTitle("Clerk");
        careers.setDepartment("Income Tax Department");
        careers.setLocation("Chennai");
        careers.setSalary( 35000.00);
        careers.setQualification("Graduate");
        careers.setAgelimit(27);
        careers.setIspermanent(true);


        String job5=  careers.getJobTitle();
        String department5 = careers.getDepartment();
        String location5= careers.getLocation();
        double salary5= careers.getSalary();
        String qualification5=careers.getQualification();
        int agelimit5= careers.getAgelimit();
        boolean ispermenent5=careers.getIspermanent();

        System.out.println("The job tile is"+job5);
        System.out.println("The job department is"+department5);
        System.out.println("The job location is"+location5);
        System.out.println("The job  salary is "+salary5);
        System.out.println("The qualification of job is"+qualification5);
        System.out.println("The age limit of job is"+ agelimit5);
        System.out.println("The job is permanet or not"+ispermenent5);
    }
}
