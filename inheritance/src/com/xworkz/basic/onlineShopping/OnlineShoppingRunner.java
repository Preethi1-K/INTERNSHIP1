package com.xworkz.basic.onlineShopping;

import com.xworkz.basic.onlineShopping.amazon.Amazon;

public class OnlineShoppingRunner {



        public static void main(String args[])
        {

            OnlineShopping shopping = new  Amazon();
            Amazon amazon =  (Amazon)shopping;
            shopping.orderProduct();
            shopping.paymentMode();
            amazon.orderProduct();
            amazon.paymentMode();
        }
    }

