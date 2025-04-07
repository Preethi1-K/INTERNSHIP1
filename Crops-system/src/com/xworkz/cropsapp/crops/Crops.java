package com.xworkz.cropsapp.crops;

public class Crops
{
        private String name;
        private String type;
        private String season;
        private double pricePerKg;
        private String originCountry;
        private int durationToGrow;
        private boolean isOrganic;

        public void setName(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void setType(String type)
        {
            this.type = type;
        }

        public String getType()
        {
            return type;
        }

        public void setSeason(String season)
        {
            this.season = season;
        }

        public String getSeason()
        {
            return season;
        }

        public void setPricePerKg(double pricePerKg)
        {
            this.pricePerKg = pricePerKg;
        }

        public double getPricePerKg()
        {
            return pricePerKg;
        }

        public void setOriginCountry(String originCountry)
        {
            this.originCountry = originCountry;
        }

        public String getOriginCountry()
        {
            return originCountry;
        }

        public void setDurationToGrow(int durationToGrow)
        {
            this.durationToGrow = durationToGrow;
        }

        public int getDurationToGrow()
        {
            return durationToGrow;
        }

        public void setIsOrganic(boolean isOrganic)
        {
            this.isOrganic = isOrganic;
        }

        public boolean getIsOrganic()
        {
            return isOrganic;
        }
}


