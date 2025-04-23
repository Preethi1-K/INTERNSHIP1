package com.xworkz.tostring.toString;

public class Laptop {

    private String brand;
    private String processor;
    private int storage;
    private double price;

    public Laptop() {
    }
@Override
    public String toString() {
        return "Laptop:(brand:" + this.brand + ",\n processor:" + this.processor + ",\n storage:" + this.storage + ",\n price:" + this.price + ")";
    }

    public String getBrand() { return brand; }
    public String getProcessor() { return processor; }
    public int getStorage() { return storage; }
    public double getPrice() { return price; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setProcessor(String processor) { this.processor = processor; }
    public void setStorage(int storage) { this.storage = storage; }
    public void setPrice(double price) { this.price = price; }
}
