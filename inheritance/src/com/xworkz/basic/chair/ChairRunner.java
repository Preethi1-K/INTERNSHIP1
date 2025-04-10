package com.xworkz.basic.chair;
import com.xworkz.basic.chair.officechair.OfficeChair;

public class ChairRunner {
    public static void main(String[] args) {

            Chair chair = new Chair();
            chair.sit();
            chair.material();

            OfficeChair officeChair = new OfficeChair();
            officeChair.sit();
            officeChair.material();

        }
    }


