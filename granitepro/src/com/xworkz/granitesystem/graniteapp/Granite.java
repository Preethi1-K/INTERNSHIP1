package com.xworkz.granitesystem.graniteapp;

public class Granite {

        private String brand;
        private String color;
        private double price;
        private String origin;
        private String material;
        private boolean isPolished;
        private double thickness;

        public void setBrand(String brand)
        {
            this.brand = brand;
        }

        public String getBrand()
        {
            return brand;
        }

        public void setColor(String color)
        {
            this.color = color;
        }

        public String getColor()
        {
            return color;
        }

        public void setPrice(double price)
        {
            this.price = price;
        }

        public double getPrice()
        {
            return price;
        }

        public void setOrigin(String origin)
        {
            this.origin = origin;
        }

        public String getOrigin()
        {
            return origin;
        }

        public void setMaterial(String material)
        {
            this.material = material;
        }

        public String getMaterial()
        {
            return material;
        }

        public void setIsPolished(boolean isPolished)
        {
            this.isPolished = isPolished;
        }

        public boolean getIsPolished()
        {
            return isPolished;
        }

        public void setThickness(double thickness)
        {
            this.thickness = thickness;
        }

        public double getThickness()
        {
            return thickness;
        }
    }


