package com.xworkz.basic.color;

import com.xworkz.basic.color.white.White;

public class ColorRunner {
    public static void main(String arg[]) {


        {
            Color info1 = new Color();
            info1.color();
            info1.white();
        }

        White info2 = new White();
        {
            info2.color();
            info2.white();
        }
    }
}

