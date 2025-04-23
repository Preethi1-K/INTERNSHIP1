package com.xworkz.tostring.toString;

public class Desk {

    private String material;
    private double length;
    private double width;
    private String color;
    private String shape;

    public Desk() {
    }
@Override
    public String toString() {
        return "Desk:(material:" + this.material + ",\n length:" + this.length + ",\n width:" + this.width + ",\n color:" + this.color + ",\n shape:" + this.shape + ")";
    }

    public String getMaterial() {
        return material;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
