package com.xworkz.tostring.toString;

public class Factory {

    private String name;
    private String product;
    private int workers;
    private String location;

    public Factory() {
    }
@Override
    public String toString() {
        return "Factory:(name:" + this.name + ",\n product:" + this.product + ",\n workers:" + this.workers + ",\n location:" + this.location + ")";
    }

    public String getName() { return name; }
    public String getProduct() { return product; }
    public int getWorkers() { return workers; }
    public String getLocation() { return location; }

    public void setName(String name) { this.name = name; }
    public void setProduct(String product) { this.product = product; }
    public void setWorkers(int workers) { this.workers = workers; }
    public void setLocation(String location) { this.location = location; }
}
