package com.xworkz.matressapp;

import com.xworkz.matressapp.matress.Matress;

public class MatressRunner {
    public static void main(String[] args) {
        Matress bedcushion = new Matress();
        bedcushion.setBrand("Sleepwell");
        bedcushion.setMaterial("Foam");
        bedcushion.setSize("Queen");
        bedcushion.setColor("White");
        bedcushion.setThickness(8.0);
        bedcushion.setIsOrthopedic(true);
        bedcushion.setPrice(15000.0);


        String brand1= bedcushion.getBrand();
        String material1 = bedcushion.getMaterial();
        String size1 = bedcushion.getSize();
        String color1 = bedcushion.getColor();
        double thickness1 = bedcushion.getThickness();
        boolean orthogonic1 = bedcushion.getIsOrthopedic();
        double price1 = bedcushion.getPrice();

        System.out.println("The brand of matress is " + brand1);
        System.out.println("The material of matress is " + material1);
        System.out.println("The size of matress is" + size1);
        System.out.println("th color of matress is" + color1);
        System.out.println("The thickness of matress is" + thickness1);
        System.out.println("The orthogonic of matress is" + orthogonic1);
        System.out.println("The price of matress is" + price1);

        Matress sleeppad = new Matress();
        sleeppad.setBrand("Kurlon");
        sleeppad.setMaterial("Spring");
        sleeppad.setSize("King");
        sleeppad.setColor("Blue");
        sleeppad.setThickness(10.0);
        sleeppad.setIsOrthopedic(false);
        sleeppad.setPrice(20000.0);


        String brand2 = bedcushion.getBrand();
        String material2 = bedcushion.getMaterial();
        String size2 = bedcushion.getSize();
        String color2 = bedcushion.getColor();
        double thickness2 = bedcushion.getThickness();
        boolean orthogonic2 = bedcushion.getIsOrthopedic();
        double price2 = bedcushion.getPrice();


        System.out.println("The brand of matress is " + brand2);
        System.out.println("The material of matress is " + material2);
        System.out.println("The size of matress is" + size2);
        System.out.println("th color of matress is" + color2);
        System.out.println("The thickness of matress is" + thickness2);
        System.out.println("The orthogonic of matress is" + orthogonic2);
        System.out.println("The price of matress is" + price2);


        Matress bedding = new Matress();
        bedding.setBrand("Duroflex");
        bedding.setMaterial("Memory Foam");
        bedding.setSize("Double");
        bedding.setColor("Grey");
        bedding.setThickness(6.0);
        bedding.setIsOrthopedic(true);
        bedding.setPrice(18000.0);


        String brand3= bedding.getBrand();
        String material3 = bedding.getMaterial();
        String size3 = bedding.getSize();
        String color3 = bedding.getColor();
        double thickness3 = bedding.getThickness();
        boolean orthogonic3 = bedding.getIsOrthopedic();
        double price3 = bedding.getPrice();


        System.out.println("The brand of matress is " + brand3);
        System.out.println("The material of matress is " + material3);
        System.out.println("The size of matress is" + size3);
        System.out.println("th color of matress is" + color3);
        System.out.println("The thickness of matress is" + thickness3);
        System.out.println("The orthogonic of matress is" + orthogonic3);
        System.out.println("The price of matress is" + price3);


        Matress sleepingMat = new Matress();
        sleepingMat.setBrand("Wakefit");
        sleepingMat.setMaterial("Latex");
        sleepingMat.setSize("Single");
        sleepingMat.setColor("Cream");
        sleepingMat.setThickness(5.0);
        sleepingMat.setIsOrthopedic(false);
        sleepingMat.setPrice(12000.0);

        String brand4 = sleepingMat.getBrand();
        String material4 = sleepingMat.getMaterial();
        String size4= sleepingMat.getSize();
        String color4 = sleepingMat.getColor();
        double thickness4 = sleepingMat.getThickness();
        boolean orthogonic4 = sleepingMat.getIsOrthopedic();
        double price4 = sleepingMat.getPrice();


        System.out.println("The brand of matress is " + brand4);
        System.out.println("The material of matress is " + material4);
        System.out.println("The size of matress is" + size4);
        System.out.println("th color of matress is" + color4);
        System.out.println("The thickness of matress is" + thickness4);
        System.out.println("The orthogonic of matress is" + orthogonic4);
        System.out.println("The price of matress is" + price4);


        Matress bedPad = new Matress();
        bedPad.setBrand("Peps");
        bedPad.setMaterial("Spring");
        bedPad.setSize("King");
        bedPad.setColor("Maroon");
        bedPad.setThickness(9.0);
        bedPad.setIsOrthopedic(true);
        bedPad.setPrice(25000.0);


        String brand5 = sleepingMat.getBrand();
        String material5 = sleepingMat.getMaterial();
        String size5 = sleepingMat.getSize();
        String color5= sleepingMat.getColor();
        double thickness5 = sleepingMat.getThickness();
        boolean orthogonic5 = sleepingMat.getIsOrthopedic();
        double price5 = sleepingMat.getPrice();


        System.out.println("The brand of matress is " + brand5);
        System.out.println("The material of matress is " + material5);
        System.out.println("The size of matress is" + size5);
        System.out.println("th color of matress is" + color5);
        System.out.println("The thickness of matress is" + thickness5);
        System.out.println("The orthogonic of matress is" + orthogonic5);
        System.out.println("The price of matress is" + price5);
    }
}
