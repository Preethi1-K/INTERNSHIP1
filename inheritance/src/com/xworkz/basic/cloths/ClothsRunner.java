package com.xworkz.basic.cloths;

import com.xworkz.basic.cloths.kurti.Kurti;

public class ClothsRunner {
    public static void main(String arg[]) {
        Cloths take = new Cloths();
        {
            take.cloths();
            take.kurti();
        }
        Kurti brand = new Kurti();
        {
            brand.cloths();
            brand.kurti();
        }
    }
}
