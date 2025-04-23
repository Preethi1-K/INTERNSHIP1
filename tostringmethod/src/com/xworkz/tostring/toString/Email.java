package com.xworkz.tostring.toString;

public class Email {

    private String providerName;
    private int userCount;
    private String founder;
    private String yearFounded;
    private String headquarters;

    public Email() {
    }
@Override
    public String toString() {
        return "Email:(providerName:" + this.providerName + ",\n userCount:" + this.userCount + ",\n founder:" + this.founder + ",\n yearFounded:" + this.yearFounded + ",\n headquarters:" + this.headquarters + ")";
    }

    public String getProviderName() {
        return providerName;
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

    public void setProviderName(String providerName) {
        this.providerName = providerName;
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
