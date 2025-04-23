package com.xworkz.tostring.toString;

public class Vehicle {

    private String brand;
    private String model;
    private int speed;
    private double price;
    private String color;

    public Vehicle() {
    }
    @Override

    public String toString() {
        return "Vehicle:(brand:" + this.brand + "model is" + this.model + "speed is" + this.model + "the speed of vehicle is" + this.speed + "price of vehicle is" + this.price + "color is" + this.color;
    }
        public String getBrand()
    {
            return brand;
    }

        public String getModel()
        {
            return model;
        }

        public int getSpeed() {
            return speed;
        }

        public double getPrice () {
            return price;
        }

        public String getColor () {
            return color;
        }

        public void setBrand (String brand)
        {
            this.brand = brand;
        }

        public void setModel (String model){
            this.model = model;
        }

        public void setSpeed ( int speed){
            this.speed = speed;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        public void setColor (String color){
            this.color = color;
        }
    }