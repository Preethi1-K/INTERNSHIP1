package com.xworkz.basic.fruit;

import com.xworkz.basic.fruit.apple.Apple;

public class FruitRunner
{
    public static void main(String arg[]) {


        Fruit gives = new Fruit();
        {
        gives.fruit1();
        gives.fruit2();
        }
        Apple avoid = new Apple() ;
        {
        avoid.fruit1();
        avoid.fruit1();
        }
    }
}
