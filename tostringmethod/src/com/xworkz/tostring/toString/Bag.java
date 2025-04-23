package com.xworkz.tostring.toString;

    public class Bag {

        private String brand;
        private String color;
        private int capacity;
        private double price;

        public Bag()
        {
        }
@Override
        public String toString()
        {
            return "Bag:(brand:" + this.brand + ",\n color:" + this.color + ",\n capacity:" + this.capacity + ",\n price:" + this.price + ")";
        }

        public String getBrand() {
            return brand;
        }

        public String getColor() {
            return color;
        }

        public int getCapacity() {
            return capacity;
        }

        public double getPrice() {
            return price;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }


