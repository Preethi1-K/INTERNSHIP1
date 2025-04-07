package com.xworkz.markerapp.marker;

public class Marker
{

        private String brand;
        private String color;
        private double price;
        private String inkType;
        private String material;
        private boolean isRefillable;
        private String madeInCountry;

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

        public void setInkType(String inkType)
        {
            this.inkType = inkType;
        }

        public String getInkType()
        {
            return inkType;
        }

        public void setMaterial(String material)
        {
            this.material = material;
        }

        public String getMaterial()
        {
            return material;
        }

        public void setIsRefillable(boolean isRefillable)
        {
            this.isRefillable = isRefillable;
        }

        public boolean getIsRefillable()
        {
            return isRefillable;
        }

        public void setMadeInCountry(String madeInCountry)
        {
            this.madeInCountry = madeInCountry;
        }

        public String getMadeInCountry()
        {
            return madeInCountry;
        }
    }


