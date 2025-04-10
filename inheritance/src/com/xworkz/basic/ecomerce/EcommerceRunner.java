package com.xworkz.basic.ecomerce;

import com.xworkz.basic.ecomerce.nyka.Nyka;

public class EcommerceRunner {
    public static void main(String arg[]) {
        Ecommerce getting = new Ecommerce();
        {
            getting.shopping();
            getting.online();
        }
        Nyka taking = new Nyka();
        {
            taking.shopping();
            taking.online();
        }
    }
}
