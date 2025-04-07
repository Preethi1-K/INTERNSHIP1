package com.xworkz.governmentjobs.jobshub;

public class GovernmentJobs {


    private String jobTitle;
    private String department;
    private String location;
    private double salary;
    private String qualification;
    private int ageLimit;
    private boolean isPermanent;



    public void setJobTitle(String jobTitle)
    {
        this.jobTitle=jobTitle;
    }
    public String getJobTitle()
    {
        return jobTitle;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public  String getDepartment()
    {
        return department;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public String getLocation()
    {
        return  location;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public  double getSalary()
    {
        return  salary;
    }
    public  void setQualification(String qualification)
    {
        this.qualification=qualification;
    }
    public  String getQualification()
    {
        return qualification;
    }
    public  void setAgelimit(int ageLimit)
    {
        this.ageLimit=ageLimit;
    }
    public int getAgelimit()
    {
    return  ageLimit;
    }
    public void setIspermanent(boolean permanent)
    {
        this.isPermanent=isPermanent;
    }
    public boolean getIspermanent()
    {
        return  isPermanent;
    }
}
