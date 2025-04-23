package com.xworkz.tostring.toString;

public class Chair {

    private String material;
    private String color;
    private double height;
    private String type;
    private boolean isReclining;

    public Chair() {
    }
@Override
    public String toString() {
        return "Chair:(material:" + this.material + ",\n color:" + this.color + ",\n height:" + this.height + ",\n type:" + this.type + ",\n isReclining:" + this.isReclining + ")";
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

    public String getType() {
        return type;
    }

    public boolean getIsReclining() {
        return isReclining;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setIsReclining(boolean isReclining) {
        this.isReclining = isReclining;
    }
}
