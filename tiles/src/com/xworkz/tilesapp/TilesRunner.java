package com.xworkz.tilesapp;
import com.xworkz.tilesapp.tiles.Tiles;
public class TilesRunner
{

        public static void main(String[] args)
        {
            Tiles tile1 = new Tiles();

            tile1.setBrand("Kajaria");
            tile1.setType("Ceramic");
            tile1.setColor("White");
            tile1.setPricePerSqFeet(55.0);
            tile1.setOriginCountry("India");
            tile1.setSize(12);
            tile1.setIsAntiSkid(true);


            String brand1=  tile1.getBrand();
            String type1=tile1.getType();
            String color1=tile1.getColor();
            double  sqfeet1=tile1.getPricePerSqFeet();
            String country1= tile1.getOriginCountry();
            int  size1=tile1.getSize();
            boolean antiskid1= tile1.getIsAntiSkid();

            System.out.println("The tiles brand is"+brand1);
            System.out.println("The tile type is"+type1);
            System.out.println("The tiles color is"+color1);
            System.out.println("The price per square tile is"+sqfeet1);
            System.out.println("The  origin country of tiles is"+country1 );
            System.out.println("The size tiles is"+size1);
            System.out.println("The  antiskid detailes of tiles is"+antiskid1);
            System.out.println("--------------------------------");

            Tiles tile2 = new Tiles();
            tile2.setBrand("Somany");
            tile2.setType("Porcelain");
            tile2.setColor("Grey");
            tile2.setPricePerSqFeet(65.0);
            tile2.setOriginCountry("India");
            tile2.setSize(16);
            tile2.setIsAntiSkid(false);


            String brand2=  tile2.getBrand();
            String type2=tile2.getType();
            String color2=tile2.getColor();
            double  sqfeet2=tile2.getPricePerSqFeet();
            String country2= tile2.getOriginCountry();
            int  size2=tile2.getSize();
            boolean antiskid2= tile2.getIsAntiSkid();

            System.out.println("The tiles brand is"+brand2);
            System.out.println("The tile type is"+type2);
            System.out.println("The tiles color is"+color2);
            System.out.println("The price per square tile is"+sqfeet2);
            System.out.println("The  origin country of tiles is"+country2 );
            System.out.println("The size tiles is"+size2);
            System.out.println("The  antiskid detailes of tiles is"+antiskid2);
            System.out.println("--------------------------------");



            Tiles tile3 = new Tiles();
            tile3.setBrand("Johnson");
            tile3.setType("Vitrified");
            tile3.setColor("Brown");
            tile3.setPricePerSqFeet(75.0);
            tile3.setOriginCountry("India");
            tile3.setSize(24);
            tile3.setIsAntiSkid(true);


            String brand3=  tile3.getBrand();
            String type3=tile3.getType();
            String color3=tile3.getColor();
            double  sqfeet3=tile3.getPricePerSqFeet();
            String country3= tile3.getOriginCountry();
            int  size3=tile3.getSize();
            boolean antiskid3= tile3.getIsAntiSkid();

            System.out.println("The tiles brand is"+brand3);
            System.out.println("The tile type is"+type3);
            System.out.println("The tiles color is"+color3);
            System.out.println("The price per square tile is"+sqfeet3);
            System.out.println("The  origin country of tiles is"+country3 );
            System.out.println("The size tiles is"+size3);
            System.out.println("The  antiskid detailes of tiles is"+antiskid3);
            System.out.println("--------------------------------");


            Tiles tile4 = new Tiles();
            tile4.setBrand("Nitco");
            tile4.setType("Marble");
            tile4.setColor("Black");
            tile4.setPricePerSqFeet(100.0);
            tile4.setOriginCountry("Italy");
            tile4.setSize(18);
            tile4.setIsAntiSkid(false);


            String brand4=  tile4.getBrand();
            String type4=tile4.getType();
            String color4=tile4.getColor();
            double  sqfeet4=tile4.getPricePerSqFeet();
            String country4= tile4.getOriginCountry();
            int  size4=tile4.getSize();
            boolean antiskid4= tile4.getIsAntiSkid();

            System.out.println("The tiles brand is"+brand4);
            System.out.println("The tile type is"+type4);
            System.out.println("The tiles color is"+color4);
            System.out.println("The price per square tile is"+sqfeet4);
            System.out.println("The  origin country of tiles is"+country4);
            System.out.println("The size tiles is"+size4);
            System.out.println("The  antiskid detailes of tiles is"+antiskid4);
            System.out.println("--------------------------------");



            Tiles tile5 = new Tiles();
            tile5.setBrand("Orientbell");
            tile5.setType("Granite");
            tile5.setColor("Beige");
            tile5.setPricePerSqFeet(85.0);
            tile5.setOriginCountry("India");
            tile5.setSize(20);
            tile5.setIsAntiSkid(true);


            String brand5=  tile5.getBrand();
            String type5=tile5.getType();
            String color5=tile5.getColor();
            double  sqfeet5=tile5.getPricePerSqFeet();
            String country5= tile5.getOriginCountry();
            int  size5=tile5.getSize();
            boolean antiskid5= tile5.getIsAntiSkid();

            System.out.println("The tiles brand is"+brand5);
            System.out.println("The tile type is"+type5);
            System.out.println("The tiles color is"+color5);
            System.out.println("The price per square tile is"+sqfeet5);
            System.out.println("The  origin country of tiles is"+country5);
            System.out.println("The size tiles is"+size5);
            System.out.println("The  antiskid detailes of tiles is"+antiskid5);
            System.out.println("--------------------------------");


        }
    }


