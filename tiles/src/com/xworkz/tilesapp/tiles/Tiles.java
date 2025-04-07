package com.xworkz.tilesapp.tiles;

public class Tiles {

        private String brand;
        private String type;
        private String color;
        private double pricePerSqFeet;
        private String originCountry;
        private int size;
        private boolean isAntiSkid;

        public void setBrand(String brand)
        {
            this.brand = brand;
        }

        public String getBrand()
        {
            return brand;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public String getType()
        {
            return type;
        }

        public void setColor(String color)
        {
            this.color = color;
        }

        public String getColor()
        {
            return color;
        }

        public void setPricePerSqFeet(double pricePerSqFeet)
        {
            this.pricePerSqFeet = pricePerSqFeet;
        }

        public double getPricePerSqFeet()
        {
            return pricePerSqFeet;
        }

        public void setOriginCountry(String originCountry)
        {
            this.originCountry = originCountry;
        }

        public String getOriginCountry()
        {
            return originCountry;
        }

        public void setSize(int size)
        {
            this.size = size;
        }

        public int getSize()
        {
            return size;
        }

        public void setIsAntiSkid(boolean isAntiSkid)
        {
            this.isAntiSkid = isAntiSkid;
        }

        public boolean getIsAntiSkid()
        {
            return isAntiSkid;
        }
    }


