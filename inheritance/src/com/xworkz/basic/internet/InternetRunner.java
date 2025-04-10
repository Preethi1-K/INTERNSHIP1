package com.xworkz.basic.internet;
import com.xworkz.basic.internet.wifi.Wifi;
public class InternetRunner {
    public static void main(String args[])
    {

            Internet internet = new Internet();
            internet.speed();
            internet.connectivity();

            Wifi wifi = new Wifi();
            wifi.speed();
            wifi.connectivity();
        }
    }



