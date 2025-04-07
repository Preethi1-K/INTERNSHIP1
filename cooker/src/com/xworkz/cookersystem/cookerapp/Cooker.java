package com.xworkz.cookersystem.cookerapp;

public class Cooker {


    private String brand;
    private String model;
    private  String color;
    private  String  capacity;
    private String  power;
    private  boolean isElectric;
    private double price;


    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public String getBrand()
    {
        return brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }
    public void setCapacity(String capacity)
    {
        this.capacity=capacity;
    }
    public String getCapacity()
    {
        return capacity;
    }
    public void setPower(String power)
    {
        this.power=power;
    }

    public String getPower()
    {
        return power;
    }

    public void setIselectric(boolean electric)
    {
        this.isElectric = isElectric;
    }

    public boolean getIselectric()
    {
        return isElectric;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }

    public double getPrice()
    {
        return price;
    }
}

