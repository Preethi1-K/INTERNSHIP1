package com.xworkz.tostring;

import com.xworkz.tostring.toString.Account;

public class AccountRunner {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber("SBIN0001345");
        account.setAccountHolder("Ravi Kumar");
        account.setType("Savings");
        account.setBalance(75000.50);


        System.out.println(account.toString());
    }
}
