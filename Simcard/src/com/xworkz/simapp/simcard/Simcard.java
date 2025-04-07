package com.xworkz.simapp.simcard;

public class Simcard
    {
        private String networkProvider;
        private String simType;
        private String number;
        private double balance;
        private boolean isActive;
        private String validity;
        private String customerName;

        public void setNetworkProvider(String networkProvider)
        {
            this.networkProvider = networkProvider;
        }

        public String getNetworkProvider()
        {
            return networkProvider;
        }

        public void setSimType(String simType)
        {
            this.simType = simType;
        }

        public String getSimType()
        {
            return simType;
        }

        public void setNumber(String number)
        {
            this.number = number;
        }

        public String getNumber()
        {
            return number;
        }

        public void setBalance(double balance)
        {
            this.balance = balance;
        }

        public double getBalance()
        {
            return balance;
        }

        public void setIsActive(boolean isActive)
        {
            this.isActive = isActive;
        }

        public boolean getIsActive()
        {
            return isActive;
        }

        public void setValidity(String validity)
        {
            this.validity = validity;
        }

        public String getValidity()
        {
            return validity;
        }

        public void setCustomerName(String customerName)
        {
            this.customerName = customerName;
        }

        public String getCustomerName()
        {
            return customerName;
        }
    }


