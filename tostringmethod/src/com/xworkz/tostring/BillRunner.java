package com.xworkz.tostring;

import com.xworkz.tostring.toString.Bill;

public class BillRunner {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.setBillNo(1021);
        bill.setDate("2025-04-21");
        bill.setAmount(975.50);
        bill.setPayee("Amazon India");

        System.out.println(bill.toString());
    }
}
