package com.xworkz.matressapp.matress;

public class Matress
{
    private String brand;
    private String material;
    private String size;
    private String color;
    private double thickness;
    private boolean isOrthopedic;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setIsOrthopedic(boolean isOrthopedic) {
        this.isOrthopedic = isOrthopedic;
    }

    public boolean getIsOrthopedic() {
        return isOrthopedic;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}



