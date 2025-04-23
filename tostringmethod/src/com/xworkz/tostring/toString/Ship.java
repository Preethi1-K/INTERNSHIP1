package com.xworkz.tostring.toString;

public class Ship {

    private String name;
    private String type;
    private double capacity;
    private double length;

    public Ship() {
    }
@Override
    public String toString() {
        return "Ship:(name:" + this.name + ",\n type:" + this.type + ",\n capacity:" + this.capacity + ",\n length:" + this.length + ")";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
