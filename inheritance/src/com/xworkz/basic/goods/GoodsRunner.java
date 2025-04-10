package com.xworkz.basic.goods;
import com.xworkz.basic.goods.electronics.Electronics;

public class GoodsRunner {

        public static void main(String args[])
        {

            Goods goods = new Goods();
            goods.type();
            goods.transport();

            Electronics electronics = new Electronics();
            electronics.type();
            electronics.transport();
        }
    }


