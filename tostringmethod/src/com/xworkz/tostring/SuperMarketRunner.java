package com.xworkz.tostring;

import com.xworkz.tostring.toString.SuperMarket;

public class SuperMarketRunner {
    public static void main(String[] args) {
        SuperMarket market = new SuperMarket();
        market.setName("FreshMart");
        market.setLocation("Mumbai");
        market.setTotalProducts(1500);
        market.setOwner("Aman Gupta");

        System.out.println(market.toString());
    }
}
