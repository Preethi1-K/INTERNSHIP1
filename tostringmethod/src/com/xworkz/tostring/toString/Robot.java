package com.xworkz.tostring.toString;

public class Robot {

        private String model;
        private String function;
        private int batteryLife;
        private String manufacturer;

        public Robot() {
        }
@Override
        public String toString() {
            return "Robot:(model:" + this.model + ",\n function:" + this.function + ",\n batteryLife:" + this.batteryLife + ",\n manufacturer:" + this.manufacturer + ")";
        }

        public String getModel() {
            return model;
        }

        public String getFunction() {
            return function;
        }

        public int getBatteryLife() {
            return batteryLife;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setFunction(String function) {
            this.function = function;
        }

        public void setBatteryLife(int batteryLife) {
            this.batteryLife = batteryLife;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }






