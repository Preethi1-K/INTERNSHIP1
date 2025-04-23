package com.xworkz.tostring.toString;

public class GovernmentJob {

    private String jobTitle;
    private String department;
    private double salary;
    private String location;
    private String qualificationRequired;

    public GovernmentJob() {
    }
@Override
    public String toString() {
        return "GovernmentJob:(jobTitle:" + this.jobTitle + ",\n department:" + this.department + ",\n salary:" + this.salary + ",\n location:" + this.location + ",\n qualificationRequired:" + this.qualificationRequired + ")";
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public String getQualificationRequired() {
        return qualificationRequired;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setQualificationRequired(String qualificationRequired) {
        this.qualificationRequired = qualificationRequired;
    }
}
