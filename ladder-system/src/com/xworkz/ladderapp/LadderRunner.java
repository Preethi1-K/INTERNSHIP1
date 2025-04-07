package com.xworkz.ladderapp;
import com.xworkz.ladderapp.ladder.Ladder;

public class LadderRunner
{
    public static void main(String[] args)
    {

            Ladder stairway = new Ladder();
            stairway.setBrand("StepUp");
            stairway.setMaterial("Aluminium");
            stairway.setSteps(5);
            stairway.setHeight(6.5);
            stairway.setPrice(2500);
            stairway.setIsFoldable(true);
            stairway.setColor("Silver");


        String brand= stairway.getBrand();
        String material=stairway.getMaterial();
        int steps=stairway.getSteps();
        double height=stairway.getHeight();
        double price= stairway.getPrice();
        boolean type=stairway.getIsFoldable();
        String color=stairway.getColor();



        System.out.println("The brand of ladder is"+brand);
        System.out.println("The material of ladder is"+material);
        System.out.println("The steps of ladder is"+steps);
        System.out.println("The height of ladder is"+height);
        System.out.println("The price of ladder is"+price);
        System.out.println("The type of ladder is"+type);
        System.out.println("The color of ladder is"+color);
        System.out.println("\n");

            Ladder stepLadder = new Ladder();
            stepLadder.setBrand("StairMax");
            stepLadder.setMaterial("Steel");
            stepLadder.setSteps(7);
            stepLadder.setHeight(8.0);
            stepLadder.setPrice(3200);
            stepLadder.setIsFoldable(true);
            stepLadder.setColor("Black");



        String brand2= stepLadder.getBrand();
        String material2=stepLadder.getMaterial();
        int steps2=stepLadder.getSteps();
        double height2=stepLadder.getHeight();
        double price2= stepLadder.getPrice();
        boolean type2=stepLadder.getIsFoldable();
        String color2=stepLadder.getColor();



        System.out.println("The brand of ladder is"+brand2);
        System.out.println("The material of ladder is"+material2);
        System.out.println("The steps of ladder is"+steps2);
        System.out.println("The height of ladder is"+height2);
        System.out.println("The price of ladder is"+price2);
        System.out.println("The type of ladder is"+type2);
        System.out.println("The color of ladder is"+color2);
        System.out.println("\n");


        Ladder staircase = new Ladder();
            staircase.setBrand("TopLadder");
            staircase.setMaterial("Fiber");
            staircase.setSteps(4);
            staircase.setHeight(5.0);
            staircase.setPrice(1800);
            staircase.setIsFoldable(false);
            staircase.setColor("White");


        String brand3= stepLadder.getBrand();
        String material3=stepLadder.getMaterial();
        int steps3=stepLadder.getSteps();
        double height3=stepLadder.getHeight();
        double price3= stepLadder.getPrice();
        boolean type3=stepLadder.getIsFoldable();
        String color3=stepLadder.getColor();



        System.out.println("The brand of ladder is"+brand3);
        System.out.println("The material of ladder is"+material3);
        System.out.println("The steps of ladder is"+steps3);
        System.out.println("The height of ladder is"+height3);
        System.out.println("The price of ladder is"+price3);
        System.out.println("The type of ladder is"+type3);
        System.out.println("The color of ladder is"+color3);
        System.out.println("\n");



        Ladder scaffold = new Ladder();
            scaffold.setBrand("SafeStep");
            scaffold.setMaterial("Wood");
            scaffold.setSteps(6);
            scaffold.setHeight(7.2);
            scaffold.setPrice(2700);
            scaffold.setIsFoldable(false);
            scaffold.setColor("Brown");


        String brand4= scaffold.getBrand();
        String material4=scaffold.getMaterial();
        int steps4=scaffold.getSteps();
        double height4=scaffold.getHeight();
        double price4= scaffold.getPrice();
        boolean type4=scaffold.getIsFoldable();
        String color4=scaffold.getColor();



        System.out.println("The brand of ladder is"+brand4);
        System.out.println("The material of ladder is"+material4);
        System.out.println("The steps of ladder is"+steps4);
        System.out.println("The height of ladder is"+height4);
        System.out.println("The price of ladder is"+price4);
        System.out.println("The type of ladder is"+type4);
        System.out.println("The color of ladder is"+color4);
        System.out.println("\n");


        Ladder stair = new Ladder();
            stair.setBrand("StrongHold");
            stair.setMaterial("Aluminium");
            stair.setSteps(8);
            stair.setHeight(9.0);
            stair.setPrice(4000);
            stair.setIsFoldable(true);
            stair.setColor("Grey");



        String brand5= stair.getBrand();
        String material5=stair.getMaterial();
        int steps5=stair.getSteps();
        double height5=stair.getHeight();
        double price5= stair.getPrice();
        boolean type5=stair.getIsFoldable();
        String color5=stair.getColor();



        System.out.println("The brand of ladder is"+brand5);
        System.out.println("The material of ladder is"+material5);
        System.out.println("The steps of ladder is"+steps5);
        System.out.println("The height of ladder is"+height5);
        System.out.println("The price of ladder is"+price5);
        System.out.println("The type of ladder is"+type5);
        System.out.println("The color of ladder is"+color5);
        System.out.println("\n");



    }



}
