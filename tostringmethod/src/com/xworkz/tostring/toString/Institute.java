package com.xworkz.tostring.toString;

public class Institute {

    private String name;
    private String location;
    private String coursesOffered;
    private int establishedYear;
    private String accreditation;

    public Institute() {
    }
@Override
    public String toString() {
        return "Institute:(name:" + this.name + ",\n location:" + this.location + ",\n coursesOffered:" + this.coursesOffered + ",\n establishedYear:" + this.establishedYear + ",\n accreditation:" + this.accreditation + ")";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCoursesOffered() {
        return coursesOffered;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCoursesOffered(String coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }
}
