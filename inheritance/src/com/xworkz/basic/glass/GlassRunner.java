package com.xworkz.basic.glass;

import com.xworkz.basic.glass.mirror.Mirror;

public class GlassRunner {

    public static void main(String args[])
    {
        Glass glass = new Glass();
        glass.recycle();
        glass.fragile();

        Mirror mirror = new Mirror();
        mirror.recycle();
        mirror.fragile();
    }
}
