package com.xworkz.basic.shoes;
import com.xworkz.basic.shoes.sportsshoes.SportsShoes;

public class ShoesRunner {
    public static void main(String args[])
    {

            Shoes shoes = new Shoes();
            shoes.material();
            shoes.purpose();

            System.out.println("------ Sports Shoes ------");

            SportsShoes sportsShoes = new SportsShoes();
            sportsShoes.material();
            sportsShoes.purpose();
        }
    }


