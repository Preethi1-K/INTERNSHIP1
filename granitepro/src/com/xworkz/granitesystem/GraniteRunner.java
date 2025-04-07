package com.xworkz.granitesystem;
import com.xworkz.granitesystem.graniteapp.Granite;

public class GraniteRunner{

        public static void main(String[] args)
        {
            Granite Stone = new Granite();
            Stone.setBrand("Johnson");
            Stone.setColor("Black");
            Stone.setPrice(2500);
            Stone.setOrigin("India");
            Stone.setMaterial("Natural Stone");
            Stone.setIsPolished(true);
            Stone.setThickness(2.5);

            String brand1=    Stone.getBrand();
            String color1=   Stone.getColor();
            double price1=  Stone.getPrice();
            String origin1 = Stone.getOrigin();
            String material1=Stone.getMaterial();
            boolean polished1=Stone.getIsPolished();
            double thickness1= Stone.getThickness();


           System.out.println("The brand of granite is"+brand1);
           System.out.println("The color of granite is"+color1);
           System.out.println("The price of granite is"+price1);
           System.out.println("The origin of granite is"+origin1);
           System.out.println("The material of granite is"+material1);
           System.out.println("The polish of granite is"+polished1);
           System.out.println("The thickness of granite is"+thickness1);
           System.out.println("\n");

            Granite solidrock = new Granite();
            solidrock.setBrand("Kajaria");
            solidrock.setColor("Grey");
            solidrock.setPrice(3000);
            solidrock.setOrigin("Italy");
            solidrock.setMaterial("Natural Stone");
            solidrock.setIsPolished(false);
            solidrock.setThickness(3.0);

            String brand2=    solidrock.getBrand();
            String color2=   solidrock.getColor();
            double price2=  solidrock.getPrice();
            String origin2 = solidrock.getOrigin();
            String material2=solidrock.getMaterial();
            boolean polished2=solidrock.getIsPolished();
            double thickness2= solidrock.getThickness();


            System.out.println("The brand of granite is"+brand2);
            System.out.println("The color of granite is"+color2);
            System.out.println("The price of granite is"+price2);
            System.out.println("The origin of granite is"+origin2);
            System.out.println("The material of granite is"+material2);
            System.out.println("The polish of granite is"+polished2);
            System.out.println("The thickness of granite is"+thickness2);
            System.out.println("\n");

            Granite toughStone = new Granite();
            toughStone.setBrand("Somany");
            toughStone.setColor("Red");
            toughStone.setPrice(2800);
            toughStone.setOrigin("Brazil");
            toughStone.setMaterial("Natural Stone");
            toughStone.setIsPolished(true);
            toughStone.setThickness(2.0);


            String brand3=    toughStone.getBrand();
            String color3=     toughStone.getColor();
            double price3=      toughStone.getPrice();
            String origin3 =    toughStone.getOrigin();
            String material3=   toughStone.getMaterial();
            boolean polished3=  toughStone.getIsPolished();
            double thickness3=  toughStone.getThickness();


            System.out.println("The brand of granite is"+brand3);
            System.out.println("The color of granite is"+color3);
            System.out.println("The price of granite is"+price3);
            System.out.println("The origin of granite is"+origin3);
            System.out.println("The material of granite is"+material3);
            System.out.println("The polish of granite is"+polished3);
            System.out.println("The thickness of granite is"+thickness3);
            System.out.println("\n");

            Granite feldsparstone = new Granite();
            feldsparstone.setBrand("Asian");
            feldsparstone.setColor("White");
            feldsparstone.setPrice(2700);
            feldsparstone.setOrigin("Spain");
            feldsparstone.setMaterial("Natural Stone");
            feldsparstone.setIsPolished(true);
            feldsparstone.setThickness(2.8);

            String brand4=    feldsparstone.getBrand();
            String color4=     feldsparstone.getColor();
            double price4=      feldsparstone.getPrice();
            String origin4 =    feldsparstone.getOrigin();
            String material4=   feldsparstone.getMaterial();
            boolean polished4=  feldsparstone.getIsPolished();
            double thickness4=  feldsparstone.getThickness();


            System.out.println("The brand of granite is"+brand4);
            System.out.println("The color of granite is"+color4);
            System.out.println("The price of granite is"+price4);
            System.out.println("The origin of granite is"+origin4);
            System.out.println("The material of granite is"+material4);
            System.out.println("The polish of granite is"+polished4);
            System.out.println("The thickness of granite is"+thickness4);
            System.out.println("\n");

            Granite naturalstone = new Granite();
            naturalstone.setBrand("Nitco");
            naturalstone.setColor("Green");
            naturalstone.setPrice(2600);
            naturalstone.setOrigin("South Africa");
            naturalstone.setMaterial("Natural Stone");
            naturalstone.setIsPolished(false);
            naturalstone.setThickness(2.3);


            String brand5 =    naturalstone.getBrand();
            String color5 =    naturalstone.getColor();
            double price5 =    naturalstone.getPrice();
            String origin5 =   naturalstone.getOrigin();
            String material5 = naturalstone.getMaterial();
            boolean polished5 =  naturalstone.getIsPolished();
            double thickness5 =  naturalstone.getThickness();


            System.out.println("The brand of granite is"+brand5);
            System.out.println("The color of granite is"+color5);
            System.out.println("The price of granite is"+price5);
            System.out.println("The origin of granite is"+origin5);
            System.out.println("The material of granite is"+material5);
            System.out.println("The polish of granite is"+polished5);
            System.out.println("The thickness of granite is"+thickness5);
            System.out.println("\n");


        }
    }


