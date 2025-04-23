package com.xworkz.tostring;

import com.xworkz.tostring.toString.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setName("HDFC");
        bank.setBranch("Indiranagar");
        bank.setIfsc("HDFC0004567");
        bank.setCity("Bangalore");

        System.out.println(bank.toString());
    }
}
