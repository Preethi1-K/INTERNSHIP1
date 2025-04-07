package com.xworkz.watertankapp;
import com.xworkz.watertankapp.watertank.WaterTank;

public class WaterTankRunner
{
    public static void main(String[] args)
        {
            WaterTank waterreservoir = new WaterTank();
            waterreservoir.setBrand("Sintex");
            waterreservoir.setCapacityInLitres(1000.0);
            waterreservoir.setShape("Cylindrical");
            waterreservoir.setColor("Black");
            waterreservoir.setPrice(7500);
            waterreservoir.setMaterial("Plastic");
            waterreservoir.setIsUVProtected(true);



            String brand1= waterreservoir.getBrand();
            double liter1= waterreservoir.getCapacityInLitres();
            String shape1=waterreservoir.getShape();
            String color1=waterreservoir.getColor();
            double price1=waterreservoir.getPrice();
            String material1=waterreservoir.getMaterial();
            boolean uvprotected1= waterreservoir.getIsUVProtected();


            System.out.println("The brand of water tank is"+brand1);
            System.out.println("The water tank liter is"+liter1);
            System.out.println("The shape of water tank is"+shape1);
            System.out.println("The color of water tank is "+color1);
            System.out.println("The price of water tank is"+price1);
            System.out.println("The material of water tank is"+material1);
            System.out.println("The uv protected water tank is"+uvprotected1);
            System.out.println("\n");

            WaterTank watercistern = new WaterTank();
            watercistern.setBrand("Prince");
            watercistern.setCapacityInLitres(750);
            watercistern.setShape("Round");
            watercistern.setColor("White");
            watercistern.setPrice(5000);
            watercistern.setMaterial("Plastic");
            waterreservoir.setIsUVProtected(true);


            String brand2= watercistern.getBrand();
            double liter2= watercistern.getCapacityInLitres();
            String shape2=watercistern.getShape();
            String color2=watercistern.getColor();
            double price2=watercistern.getPrice();
            String material2=watercistern.getMaterial();
            boolean uvprotected2= watercistern.getIsUVProtected();


            System.out.println("The brand of water tank is"+brand2);
            System.out.println("The water tank liter is"+liter2);
            System.out.println("The shape of water tank is"+shape2);
            System.out.println("The color of water tank is "+color2);
            System.out.println("The price of water tank is"+price2);
            System.out.println("The material of water tank is"+material2);
            System.out.println("The uv protected water tank is"+uvprotected2);
            System.out.println("\n");

            WaterTank watervessel = new WaterTank();
            watervessel.setBrand("Vectus");
            watervessel.setCapacityInLitres(500);
            watervessel.setShape("Square");
            watervessel.setColor("Yellow");
            watervessel.setPrice(3500);
            watervessel.setMaterial("HDPE");
            watervessel.setIsUVProtected(false);


            String brand3= watervessel.getBrand();
            double liter3= watervessel.getCapacityInLitres();
            String shape3=watervessel.getShape();
            String color3=watervessel.getColor();
            double price3=watervessel.getPrice();
            String material3=watervessel.getMaterial();
            boolean uvprotected3= watervessel.getIsUVProtected();


            System.out.println("The brand of water tank is"+brand3);
            System.out.println("The water tank liter is"+liter3);
            System.out.println("The shape of water tank is"+shape3);
            System.out.println("The color of water tank is "+color3);
            System.out.println("The price of water tank is"+price3);
            System.out.println("The material of water tank is"+material3);
            System.out.println("The uv protected water tank is"+uvprotected3);
            System.out.println("\n");


            WaterTank storagetank = new WaterTank();
            storagetank.setBrand("National");
            storagetank.setCapacityInLitres(1500);
            storagetank.setShape("Rectangular");
            storagetank.setColor("Green");
            storagetank.setPrice(9000);
            storagetank.setMaterial("Plastic");
            storagetank.setIsUVProtected(true);


            String brand4= storagetank.getBrand();
            double liter4= storagetank.getCapacityInLitres();
            String shape4=storagetank.getShape();
            String color4=storagetank.getColor();
            double price4=storagetank.getPrice();
            String material4=storagetank.getMaterial();
            boolean uvprotected4= storagetank.getIsUVProtected();


            System.out.println("The brand of water tank is"+brand4);
            System.out.println("The water tank liter is"+liter4);
            System.out.println("The shape of water tank is"+shape4);
            System.out.println("The color of water tank is "+color4);
            System.out.println("The price of water tank is"+price4);
            System.out.println("The material of water tank is"+material4);
            System.out.println("The uv protected water tank is"+uvprotected4);
            System.out.println("\n");

            WaterTank waterbasin= new WaterTank();
            waterbasin.setBrand("Supreme");
            waterbasin.setCapacityInLitres(2000);
            waterbasin.setShape("Cylindrical");
            waterbasin.setColor("Blue");
            waterbasin.setPrice(12000);
            waterbasin.setMaterial("LLDPE");
            waterbasin.setIsUVProtected(true);




            String brand5= waterbasin.getBrand();
            double liter5= waterbasin.getCapacityInLitres();
            String shape5=waterbasin.getShape();
            String color5=waterbasin.getColor();
            double price5=waterbasin.getPrice();
            String material5=waterbasin.getMaterial();
            boolean uvprotected5= waterbasin.getIsUVProtected();


            System.out.println("The brand of water tank is"+brand5);
            System.out.println("The water tank liter is"+liter5);
            System.out.println("The shape of water tank is"+shape5);
            System.out.println("The color of water tank is "+color5);
            System.out.println("The price of water tank is"+price5);
            System.out.println("The material of water tank is"+material5);
            System.out.println("The uv protected water tank is"+uvprotected5);
            System.out.println("\n");


        }
    }




