package com.xworkz.basic.chair;
import com.xworkz.basic.chair.officechair.OfficeChair;

public class ChairRunner {
    public static void main(String[] args) {

            Chair chair = new OfficeChair();
            OfficeChair officeChair=(OfficeChair)chair;
            officeChair. sit();
            officeChair.material();


        }
    }


