package com.xworkz.tostring.toString;

public class LinkedIn {

    private String platformName;
    private int userCount;
    private String founder;
    private String yearFounded;
    private String headquarters;

    public LinkedIn() {
    }
@Override
    public String toString() {
        return "LinkedIn:(platformName:" + this.platformName + ",\n userCount:" + this.userCount + ",\n founder:" + this.founder + ",\n yearFounded:" + this.yearFounded + ",\n headquarters:" + this.headquarters + ")";
    }

    public String getPlatformName() {
        return platformName;
    }

    public int getUserCount() {
        return userCount;
    }

    public String getFounder() {
        return founder;
    }

    public String getYearFounded() {
        return yearFounded;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setYearFounded(String yearFounded) {
        this.yearFounded = yearFounded;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }
}
