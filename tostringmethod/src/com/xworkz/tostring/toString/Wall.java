package com.xworkz.tostring.toString;

public class Wall {

    private String material;
    private double height;
    private double width;
    private String color;

    public Wall() {
    }
@Override
    public String toString() {
        return "Wall:(material:" + this.material + ",\n height:" + this.height + ",\n width:" + this.width + ",\n color:" + this.color + ")";
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
