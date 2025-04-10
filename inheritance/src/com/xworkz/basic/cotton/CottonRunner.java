package com.xworkz.basic.cotton;

import com.xworkz.basic.cotton.cloths.Cloths;

public class CottonRunner {
    public static void main(String[] args)
    {

            Cotton cotton = new Cotton();
            cotton.natural();
            cotton.uses();

            Cloths cloth = new Cloths();
            cloth.natural();
            cloth.uses();
        }
    }


