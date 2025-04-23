package com.xworkz.tostring.toString;

public class Box {

    private String material;
    private String color;
    private double height;
    private double width;

    public Box() {
    }
@Override
    public String toString() {
        return "Box:(material:" + this.material + ",\n color:" + this.color + ",\n height:" + this.height + ",\n width:" + this.width + ")";
    }

    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public double getHeight() { return height; }
    public double getWidth() { return width; }

    public void setMaterial(String material) { this.material = material; }
    public void setColor(String color) { this.color = color; }
    public void setHeight(double height) { this.height = height; }
    public void setWidth(double width) { this.width = width; }
}
