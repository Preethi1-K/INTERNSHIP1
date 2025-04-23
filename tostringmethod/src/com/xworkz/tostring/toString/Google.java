package com.xworkz.tostring.toString;

public class Google {

    private String founder;
    private String productName;
    private String userCount;
    private String headquarters;
    private String yearFounded;

    public Google() {
    }
@Override
    public String toString() {
        return "Google:(founder:" + this.founder + ",\n productName:" + this.productName + ",\n userCount:" + this.userCount + ",\n headquarters:" + this.headquarters + ",\n yearFounded:" + this.yearFounded + ")";
    }

    public String getFounder() {
        return founder;
    }

    public String getProductName() {
        return productName;
    }

    public String  getUserCount()
    {
        return userCount;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public String getYearFounded() {
        return yearFounded;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public void setYearFounded(String yearFounded) {
        this.yearFounded = yearFounded;
    }
}
