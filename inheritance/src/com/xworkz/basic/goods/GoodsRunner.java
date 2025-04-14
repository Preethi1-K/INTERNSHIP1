package com.xworkz.basic.goods;
import com.xworkz.basic.goods.electronics.Electronics;

public class GoodsRunner {

        public static void main(String args[])
        {

            Goods goods = new Electronics() ;
            Electronics electronics =(Electronics)goods;
            goods.type();
            electronics.type();
            electronics.transport();
        }
    }


