package com.xworkz.tostring.toString;

public class Projector {

    private String brand;
    private double brightness;
    private double weight;
    private String resolution;
    private String type;

    public Projector() {
    }
@Override
    public String toString() {
        return "Projector:(brand:" + this.brand + ",\n brightness:" + this.brightness + ",\n weight:" + this.weight + ",\n resolution:" + this.resolution + ",\n type:" + this.type + ")";
    }

    public String getBrand() {
        return brand;
    }

    public double getBrightness() {
        return brightness;
    }

    public double getWeight() {
        return weight;
    }

    public String getResolution() {
        return resolution;
    }

    public String getType() {
        return type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setType(String type) {
        this.type = type;
    }
}
