package com.xworkz.basic.cotton;

import com.xworkz.basic.cotton.cloths.Cloths;

import java.util.Arrays;

public class CottonRunner {
    public static void main(String[] args)
    {

            Cotton cotton = new Cloths();
            Cloths cloth = (Cloths)cotton;
            cloth.natural();
            cotton.uses();

        }
    }


