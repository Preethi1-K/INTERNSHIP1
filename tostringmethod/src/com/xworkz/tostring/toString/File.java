package com.xworkz.tostring.toString;

public class File {

    private String name;
    private String extension;
    private double size;
    private String location;

    public File() {
    }
@Override
    public String toString() {
        return "File:(name:" + this.name + ",\n extension:" + this.extension + ",\n size:" + this.size + ",\n location:" + this.location + ")";
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public double getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
