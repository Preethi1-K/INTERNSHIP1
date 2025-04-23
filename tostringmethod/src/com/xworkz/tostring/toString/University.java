package com.xworkz.tostring.toString;

public class University {

    private String name;
    private String location;
    private int establishedYear;
    private int numberOfDepartments;
    private String rank;

    public University() {
    }
@Override
    public String toString() {
        return "University:(name:" + this.name + ",\n location:" + this.location + ",\n establishedYear:" + this.establishedYear + ",\n numberOfDepartments:" + this.numberOfDepartments + ",\n rank:" + this.rank + ")";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public String getRank() {
        return rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
