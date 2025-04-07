package com.xworkz.watertankapp.watertank;

public class WaterTank
{

        private String brand;
        private double capacityInLitres;
        private String shape;
        private String color;
        private double price;
        private String material;
        private boolean isUVProtected;

        public void setBrand(String brand)
        {
            this.brand = brand;
        }

        public String getBrand()
        {
            return brand;
        }

        public void setCapacityInLitres(double capacityInLitres)
        {
            this.capacityInLitres = capacityInLitres;
        }

        public double getCapacityInLitres()
        {
            return capacityInLitres;
        }

        public void setShape(String shape)
        {
            this.shape = shape;
        }

        public String getShape()
        {
            return shape;
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

        public void setMaterial(String material)
        {
            this.material = material;
        }

        public String getMaterial()
        {
            return material;
        }

        public void setIsUVProtected(boolean isUVProtected)
        {
            this.isUVProtected = isUVProtected;
        }

        public boolean getIsUVProtected()
        {
            return isUVProtected;
        }
    }


