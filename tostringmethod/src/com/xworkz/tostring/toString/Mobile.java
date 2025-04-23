package com.xworkz.tostring.toString;

public class Mobile {

    private String brand;
    private String model;
    private int ram;
    private double price;

    public Mobile() {
    }
@Override
    public String toString() {
        return "Mobile:(brand:" + this.brand + ",\n model:" + this.model + ",\n ram:" + this.ram + ",\n price:" + this.price + ")";
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getRam() { return ram; }
    public double getPrice() { return price; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setRam(int ram) { this.ram = ram; }
    public void setPrice(double price) { this.price = price; }
}
