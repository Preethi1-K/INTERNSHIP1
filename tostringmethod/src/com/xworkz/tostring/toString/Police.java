package com.xworkz.tostring.toString;

public class Police {

    private String name;
    private String rank;
    private String badgeNumber;
    private String department;

    public Police() {
    }
@Override
    public String toString() {
        return "Police:(name:" + this.name + ",\n rank:" + this.rank + ",\n badgeNumber:" + this.badgeNumber + ",\n department:" + this.department + ")";
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
