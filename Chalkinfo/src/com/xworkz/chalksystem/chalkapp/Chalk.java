package com.xworkz.chalksystem.chalkapp;

public class Chalk {
    private String color;
    private String brand;
    private String material;
    private double length;
    private double thickness;
    private double price;
    private boolean isDustless;

    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public String getBrand()
    {
        return brand;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    public void setThickness(double thickness)
    {
        this.thickness = thickness;
    }

    public double getThickness()
    {
        return thickness;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setIsdustless(boolean isDustless)
    {
        this. isDustless = isDustless;
    }
    public boolean getIsdustless()
    {
        return isDustless;
    }
}


