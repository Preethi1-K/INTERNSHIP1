package com.xworkz.Magiggesystem.magigge;

public class Magigge {

        private String brand;
        private String flavor;
        private double pricePerLitre;
        private boolean isSalted;
        private String originPlace;
        private int quantity;
        private boolean isOrganic;

        public void setBrand(String brand)
        {
            this.brand = brand;
        }

        public String getBrand()
        {
            return brand;
        }

        public void setFlavor(String flavor)
        {
            this.flavor = flavor;
        }

        public String getFlavor()
        {
            return flavor;
        }

        public void setPricePerLitre(double pricePerLitre)
        {
            this.pricePerLitre = pricePerLitre;
        }

        public double getPricePerLitre()
        {
            return pricePerLitre;
        }

        public void setIsSalted(boolean isSalted)
        {
            this.isSalted = isSalted;
        }

        public boolean getIsSalted()
        {
            return isSalted;
        }

        public void setOriginPlace(String originPlace)
        {
            this.originPlace = originPlace;
        }

        public String getOriginPlace()
        {
            return originPlace;
        }

        public void setQuantity(int quantity)
        {
            this.quantity = quantity;
        }

        public int getQuantity()
        {
            return quantity;
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


