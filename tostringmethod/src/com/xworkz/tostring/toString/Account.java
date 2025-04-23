package com.xworkz.tostring.toString;

public class Account {

    private String accountNumber;
    private String accountHolder;
    private String type;
    private double balance;

    public Account() {
    }

    @Override

    public String toString()
    {
        return "Account:(accountNumber:" + this.accountNumber + ",\n accountHolder:" + this.accountHolder + ",\n type:" + this.type + ",\n balance:" + this.balance + ")";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
