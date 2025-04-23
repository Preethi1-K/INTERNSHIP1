package com.xworkz.tostring.toString;

public class Bank {

    private String name;
    private String branch;
    private String ifsc;
    private String city;

    public Bank() {
    }
@Override
    public String toString() {
        return "Bank:(name:" + this.name + ",\n branch:" + this.branch + ",\n ifsc:" + this.ifsc + ",\n city:" + this.city + ")";
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getIfsc() {
        return ifsc;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
