package com.xworkz.tostring.toString;

public class Bill {

    private int billNo;
    private String date;
    private double amount;
    private String payee;

    public Bill() {
    }
@Override
    public String toString() {
        return "Bill:(billNo:" + this.billNo + ",\n date:" + this.date + ",\n amount:" + this.amount + ",\n payee:" + this.payee + ")";
    }

    public int getBillNo() {
        return billNo;
    }

    public String getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getPayee() {
        return payee;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }
}
