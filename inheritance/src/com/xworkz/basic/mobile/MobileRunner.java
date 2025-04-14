package com.xworkz.basic.mobile;

import com.xworkz.basic.mobile.samsung.Samsung;

public class MobileRunner {

    public static void main(String arg[])
    {
        Mobile take = new Samsung();
        Samsung provide = (Samsung)take;

            take.handSet();
            take.phone();
            provide.handSet();
            provide.phone();

    }
}
