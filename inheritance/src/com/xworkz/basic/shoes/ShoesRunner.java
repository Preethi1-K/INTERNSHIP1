package com.xworkz.basic.shoes;
import com.xworkz.basic.shoes.sportsshoes.SportsShoes;

public class ShoesRunner {
    public static void main(String args[])
    {

            Shoes shoes = new SportsShoes();
        SportsShoes sportsShoes =( SportsShoes)shoes;
            shoes.material();
            shoes.purpose();
            sportsShoes.material();
            sportsShoes.purpose();
        }
    }


