package com.xworkz.cropsapp;
import com.xworkz.cropsapp.crops.Crops;

public class CropsRunner
    {
        public static void main(String[] args)
        {
            Crops harvest = new Crops();
            harvest.setName("Wheat");
            harvest.setType("Cereal");
            harvest.setSeason("Rabi");
            harvest.setPricePerKg(25.50);
            harvest.setOriginCountry("India");
            harvest.setDurationToGrow(120);
            harvest.setIsOrganic(true);



            String name1= harvest.getName();
            String type1=harvest.getType();
            String season1=harvest.getSeason();
            double price1=harvest.getPricePerKg();
            String country1=harvest.getOriginCountry();
            int duration1= harvest.getDurationToGrow();
            boolean status1=harvest.getIsOrganic();

            System.out.println("The name of crop is"+name1);
            System.out.println("The type of crop is" +type1 );
            System.out.println("The season of crop is"+season1);
            System.out.println("The price of crop is" +price1);
            System.out.println("The country of the crop is"+country1);
            System.out.println("The durartion of crop is"+ duration1);
            System.out.println("The status of crop is"+status1);
            System.out.println("/n");

            Crops yield = new Crops();
            yield.setName("Rice");
            yield.setType("Cereal");
            yield.setSeason("Kharif");
            yield.setPricePerKg(30.00);
            yield.setOriginCountry("India");
            yield.setDurationToGrow(150);
            yield.setIsOrganic(false);


            String name2= yield.getName();
            String type2=yield.getType();
            String season2=yield.getSeason();
            double price2=yield.getPricePerKg();
            String country2=yield.getOriginCountry();
            int duration2= yield.getDurationToGrow();
            boolean status2=yield.getIsOrganic();

            System.out.println("The name of crop is"+name2);
            System.out.println("The type of crop is" +type2 );
            System.out.println("The season of crop is"+season2);
            System.out.println("The price of crop is" +price2);
            System.out.println("The country of the crop is"+country2);
            System.out.println("The durartion of crop is"+ duration2);
            System.out.println("The status of crop is"+status2);
            System.out.println("/n");

            Crops produce = new Crops();
            produce.setName("Tomato");
            produce.setType("Vegetable");
            produce.setSeason("Summer");
            produce.setPricePerKg(20.00);
            produce.setOriginCountry("India");
            produce.setDurationToGrow(60);
            produce.setIsOrganic(true);


            String name3= produce.getName();
            String type3=produce.getType();
            String season3=produce.getSeason();
            double price3=produce.getPricePerKg();
            String country3=produce.getOriginCountry();
            int duration3= produce.getDurationToGrow();
            boolean status3=produce.getIsOrganic();

            System.out.println("The name of crop is"+name3);
            System.out.println("The type of crop is" +type3 );
            System.out.println("The season of crop is"+season3);
            System.out.println("The price of crop is" +price3);
            System.out.println("The country of the crop is"+country3);
            System.out.println("The durartion of crop is"+ duration3);
            System.out.println("The status of crop is"+status3);
            System.out.println("/n");




            Crops cultivation = new Crops();
            cultivation.setName("Cotton");
            cultivation.setType("Fiber Crop");
            cultivation.setSeason("Kharif");
            cultivation.setPricePerKg(60.00);
            cultivation.setOriginCountry("India");
            cultivation.setDurationToGrow(180);
            cultivation.setIsOrganic(false);


            String name4= cultivation.getName();
            String type4=cultivation.getType();
            String season4=cultivation.getSeason();
            double price4=cultivation.getPricePerKg();
            String country4=cultivation.getOriginCountry();
            int duration4= cultivation.getDurationToGrow();
            boolean status4=cultivation.getIsOrganic();

            System.out.println("The name of crop is"+name4);
            System.out.println("The type of crop is" +type4 );
            System.out.println("The season of crop is"+season4);
            System.out.println("The price of crop is" +price4);
            System.out.println("The country of the crop is"+country4);
            System.out.println("The durartion of crop is"+ duration4);
            System.out.println("The status of crop is"+status4);
            System.out.println("/n");




            Crops growth = new Crops();
            growth.setName("Sugarcane");
            growth.setType("Commercial Crop");
            growth.setSeason("Annual");
            growth.setPricePerKg(40.00);
            growth.setOriginCountry("India");
            growth.setDurationToGrow(270);
            growth.setIsOrganic(true);

            String name5= growth.getName();
            String type5=growth.getType();
            String season5=growth.getSeason();
            double price5=growth.getPricePerKg();
            String country5=growth.getOriginCountry();
            int duration5= growth.getDurationToGrow();
            boolean status5=growth.getIsOrganic();

            System.out.println("The name of crop is"+name5);
            System.out.println("The type of crop is" +type5);
            System.out.println("The season of crop is"+season5);
            System.out.println("The price of crop is" +price5);
            System.out.println("The country of the crop is"+country5);
            System.out.println("The durartion of crop is"+ duration5);
            System.out.println("The status of crop is"+status5);
            System.out.println("/n");


        }
    }


