package com.xworkz.tostring.toString;

public class AC {

    private String brand;
    private String type;
    private int capacity;
    private double price;
    private String disccount;

    public AC() {
    }

    public String toString() {
        return "AC:(brand:" + this.brand + ",\n type:" + this.type + ",\n capacity:" + this.capacity + ",\n price:" + this.price + ","+"disscount is"+this.disccount;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }
    public String getDisccount()
    {
        return disccount;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setDisccount(String disccount)
    {
        this.disccount=disccount;
    }
}
