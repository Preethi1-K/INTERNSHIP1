package com.xworkz.basic.glass;

import com.xworkz.basic.glass.mirror.Mirror;

public class GlassRunner {

    public static void main(String args[])
    {
        Glass glass = new Glass();
        Mirror mirror = new Mirror();
        glass.recycle();
        mirror.fragile();
    }
}
