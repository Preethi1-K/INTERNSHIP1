package com.xworkz.tostring;

import com.xworkz.tostring.toString.Telegram;

public class TelegramRunner
{
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        telegram.setPlatformName("Telegram");
        telegram.setFounder("Pavel Durov");
        telegram.setUserCount(700000000);
        telegram.setYearFounded("2013");
        telegram.setHeadquarters("Dubai, UAE");

        System.out.println(telegram.toString());
    }
}
