package com.xworkz.basic.onlineShopping;

import com.xworkz.basic.onlineShopping.amazon.Amazon;

public class OnlineShoppingRunner {



        public static void main(String args[])
        {

            OnlineShopping shopping = new OnlineShopping();
            shopping.orderProduct();
            shopping.paymentMode();

            Amazon amazon = new Amazon();
            amazon.orderProduct();
            amazon.paymentMode();
        }
    }

