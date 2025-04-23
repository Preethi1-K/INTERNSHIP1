package com.xworkz.tostring.toString;

public class App {

    private String name;
    private String version;
    private String developer;
    private double size;

    public App() {
    }
@Override
    public String toString() {
        return "App:(name:" + this.name + ",\n version:" + this.version + ",\n developer:" + this.developer + ",\n size:" + this.size + ")";
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getDeveloper() {
        return developer;
    }

    public double getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
