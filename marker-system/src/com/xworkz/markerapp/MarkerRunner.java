package com.xworkz.markerapp;
import com.xworkz.markerapp.marker.Marker;

public class MarkerRunner {

    public static void main(String[] args)
        {
            Marker sketchPen= new Marker();
            sketchPen.setBrand("Camlin");
            sketchPen.setColor("Black");
            sketchPen.setPrice(25.0);
            sketchPen.setInkType("Permanent");
            sketchPen.setMaterial("Plastic");
            sketchPen.setIsRefillable(true);
            sketchPen.setMadeInCountry("India");




            String brand= sketchPen.getBrand();
            String color=sketchPen.getColor();
            double price= sketchPen.getPrice();
            String inktype=sketchPen.getInkType();
            String material=sketchPen.getMaterial();
            boolean refilable= sketchPen.getIsRefillable();
            String country=sketchPen.getMadeInCountry();

            System.out.println("The brand of marker is"+brand);
            System.out.println("The color of marker is"+color);
            System.out.println("The price of marker is"+price);
            System.out.println("The inktype of marker is"+inktype);
            System.out.println("The material of marker is"+material);
            System.out.println("The refilable of marker is"+refilable);
            System.out.println("The marker made by"+country);
            System.out.println("\n");

            Marker felttipPen = new Marker();
            felttipPen.setBrand("Faber-Castell");
            felttipPen.setColor("Blue");
            felttipPen.setPrice(30.0);
            felttipPen.setInkType("Whiteboard");
            felttipPen.setMaterial("Plastic");
            felttipPen.setIsRefillable(false);
            felttipPen.setMadeInCountry("Germany");

            String brand2= felttipPen.getBrand();
            String color2=felttipPen.getColor();
            double price2= felttipPen.getPrice();
            String inktype2=felttipPen.getInkType();
            String material2=felttipPen.getMaterial();
            boolean refilable2= felttipPen.getIsRefillable();
            String country2=felttipPen.getMadeInCountry();

            System.out.println("The brand of marker is"+brand2);
            System.out.println("The color of marker is"+color2);
            System.out.println("The price of marker is"+price2);
            System.out.println("The inktype of marker is"+inktype2);
            System.out.println("The material of marker is"+material2);
            System.out.println("The refilable of marker is"+refilable2);
            System.out.println("The marker made by"+country2);
            System.out.println("\n");



            Marker boardmarker= new Marker();
            boardmarker.setBrand("Luxor");
            boardmarker.setColor("Red");
            boardmarker.setPrice(20.0);
            boardmarker.setInkType("Permanent");
            boardmarker.setMaterial("Plastic");
            boardmarker.setIsRefillable(true);
            boardmarker.setMadeInCountry("India");


            String brand3= boardmarker.getBrand();
            String color3=boardmarker.getColor();
            double price3= boardmarker.getPrice();
            String inktype3=boardmarker.getInkType();
            String material3=boardmarker.getMaterial();
            boolean refilable3= boardmarker.getIsRefillable();
            String country3=boardmarker.getMadeInCountry();

            System.out.println("The brand of marker is"+brand3);
            System.out.println("The color of marker is"+color3);
            System.out.println("The price of marker is"+price3);
            System.out.println("The inktype of marker is"+inktype3);
            System.out.println("The material of marker is"+material3);
            System.out.println("The refilable of marker is"+refilable3);
            System.out.println("The marker made by"+country3);
            System.out.println("\n");

            Marker texta = new Marker();
            texta.setBrand("Cello");
            texta.setColor("Green");
            texta.setPrice(28.0);
            texta.setInkType("Whiteboard");
            texta.setMaterial("Plastic");
            texta.setIsRefillable(false);
            texta.setMadeInCountry("India");


            String brand4= texta.getBrand();
            String color4=texta.getColor();
            double price4= texta.getPrice();
            String inktype4=texta.getInkType();
            String material4=texta.getMaterial();
            boolean refilable4=texta.getIsRefillable();
            String country4=texta.getMadeInCountry();

            System.out.println("The brand of marker is"+brand4);
            System.out.println("The color of marker is"+color4);
            System.out.println("The price of marker is"+price4);
            System.out.println("The inktype of marker is"+inktype4);
            System.out.println("The material of marker is"+material4);
            System.out.println("The refilable of marker is"+refilable4);
            System.out.println("The marker made by"+country4);
            System.out.println("\n");

            Marker inkPen = new Marker();
            inkPen.setBrand("Reynolds");
            inkPen.setColor("Black");
            inkPen.setPrice(35.0);
            inkPen.setInkType("Permanent");
            inkPen.setMaterial("Plastic");
            inkPen.setIsRefillable(true);
            inkPen.setMadeInCountry("USA");


            String brand5=inkPen.getBrand();
            String color5=inkPen.getColor();
            double price5= inkPen.getPrice();
            String inktype5=inkPen.getInkType();
            String material5=inkPen.getMaterial();
            boolean refilable5=inkPen.getIsRefillable();
            String country5=inkPen.getMadeInCountry();

            System.out.println("The brand of marker is"+brand5);
            System.out.println("The color of marker is"+color5);
            System.out.println("The price of marker is"+price5);
            System.out.println("The inktype of marker is"+inktype5);
            System.out.println("The material of marker is"+material5);
            System.out.println("The refilable of marker is"+refilable5);
            System.out.println("The marker made by"+country5);
            System.out.println("\n");


        }
    }


