package com.xworkz.basic.mobile;

import com.xworkz.basic.mobile.samsung.Samsung;

public class MobileRunner {

    public static void main(String arg[]) {
        Mobile take = new Mobile();
        {
            take.handSet();
            take.phone();
        }
        Samsung provide = new Samsung();
        {
            provide.handSet();
            provide.phone();
        }
    }
}
