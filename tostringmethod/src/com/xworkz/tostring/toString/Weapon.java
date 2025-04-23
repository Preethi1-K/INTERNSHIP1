package com.xworkz.tostring.toString;

public class Weapon {

    private String name;
    private String type;
    private double weight;
    private String manufacturer;

    public Weapon() {
    }
@Override
    public String toString() {
        return "Weapon:(name:" + this.name + ",\n type:" + this.type + ",\n weight:" + this.weight + ",\n manufacturer:" + this.manufacturer + ")";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
