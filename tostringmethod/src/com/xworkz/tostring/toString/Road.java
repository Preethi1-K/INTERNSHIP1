package com.xworkz.tostring.toString;

public class Road {

    private String name;
    private String location;
    private int length;
    private String type;
    private String condition;

    public Road() {
    }
@Override
    public String toString() {
        return "Road:(name:" + this.name + ",\n location:" + this.location + ",\n length:" + this.length + ",\n type:" + this.type + ",\n condition:" + this.condition + ")";
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public String getCondition() {
        return condition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
