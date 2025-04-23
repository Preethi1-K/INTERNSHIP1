package com.xworkz.tostring.toString;

public class Job {

    private String title;
    private String company;
    private int salary;
    private String location;
    private String department;

    public Job() {
    }
@Override
    public String toString() {
        return "Job:(title:" + this.title + ",\n company:" + this.company + ",\n salary:" + this.salary + ",\n location:" + this.location + ",\n department:" + this.department + ")";
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    public String getLocation() {
        return location;
    }

    public String getDepartment() {
        return department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
