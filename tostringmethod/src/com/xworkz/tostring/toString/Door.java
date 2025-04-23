package com.xworkz.tostring.toString;

public class Door {

    private String material;
    private String color;
    private String type;
    private double height;
    private double width;

    public Door() {
    }
@Override
    public String toString() {
        return "Door:(material:" + this.material + ",\n color:" + this.color + ",\n type:" + this.type + ",\n height:" + this.height + ",\n width:" + this.width + ")";
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
