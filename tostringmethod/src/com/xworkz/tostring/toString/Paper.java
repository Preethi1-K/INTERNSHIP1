package com.xworkz.tostring.toString;

public class Paper
{

        private String size;
        private String type;
        private int gsm;
        private String color;

        public Paper() {
        }
@Override
        public String toString() {
            return "Paper:(size:" + this.size + ",\n type:" + this.type + ",\n gsm:" + this.gsm + ",\n color:" + this.color + ")";
        }

        public String getSize() {
            return size;
        }

        public String getType() {
            return type;
        }

        public int getGsm() {
            return gsm;
        }

        public String getColor() {
            return color;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setGsm(int gsm) {
            this.gsm = gsm;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }


