package com.xworkz.tostring.toString;

public class Hospital {

    private String name;
    private String location;
    private int totalBeds;
    private String specialty;

    public Hospital() {
    }
@Override
    public String toString() {
        return "Hospital:(name:" + this.name + ",\n location:" + this.location + ",\n totalBeds:" + this.totalBeds + ",\n specialty:" + this.specialty + ")";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTotalBeds() {
        return totalBeds;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
