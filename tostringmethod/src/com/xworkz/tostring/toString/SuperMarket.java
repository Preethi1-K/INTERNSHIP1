package com.xworkz.tostring.toString;

public class SuperMarket {

    private String name;
    private String location;
    private int totalProducts;
    private String owner;

    public SuperMarket() {
    }
@Override
    public String toString() {
        return "SuperMarket:(name:" + this.name + ",\n location:" + this.location + ",\n totalProducts:" + this.totalProducts + ",\n owner:" + this.owner + ")";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
