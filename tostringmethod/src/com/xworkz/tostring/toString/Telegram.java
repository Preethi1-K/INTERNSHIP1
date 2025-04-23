package com.xworkz.tostring.toString;

public class Telegram {

    private String platformName;
    private String founder;
    private int userCount;
    private String yearFounded;
    private String headquarters;

    public Telegram() {
    }
@Override
    public String toString() {
        return "Telegram:(platformName:" + this.platformName + ",\n founder:" + this.founder + ",\n userCount:" + this.userCount + ",\n yearFounded:" + this.yearFounded + ",\n headquarters:" + this.headquarters + ")";
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getFounder() {
        return founder;
    }

    public int getUserCount() {
        return userCount;
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

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public void setYearFounded(String yearFounded) {
        this.yearFounded = yearFounded;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }
}
