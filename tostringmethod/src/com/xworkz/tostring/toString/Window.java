package com.xworkz.tostring.toString;

public class Window {

    private String material;
    private String color;
    private double height;
    private double width;
    private String type;

    public Window() {
    }
@Override
    public String toString() {
        return "Window:(material:" + this.material + ",\n color:" + this.color + ",\n height:" + this.height + ",\n width:" + this.width + ",\n type:" + this.type + ")";
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setType(String type) {
        this.type = type;
    }
}
