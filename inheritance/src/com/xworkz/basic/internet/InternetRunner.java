package com.xworkz.basic.internet;
import com.xworkz.basic.internet.wifi.Wifi;
public class InternetRunner {
    public static void main(String args[])
    {

            Internet internet = new Wifi();
             Wifi wifi =  (Wifi)internet;
            internet.speed();
            wifi.speed();

        }
    }



