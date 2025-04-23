package com.xworkz.tostring.toString;

public class Transistor {

    private String brand;
    private String type;
    private double powerRating;
    private String model;

    public Transistor() {
    }
@Override
    public String toString() {
        return "Transistor:(brand:" + this.brand + ",\n type:" + this.type + ",\n powerRating:" + this.powerRating + ",\n model:" + this.model + ")";
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public double getPowerRating() {
        return powerRating;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
