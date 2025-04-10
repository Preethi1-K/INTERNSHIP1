package com.xworkz.basic.bank;
import com.xworkz.basic.bank.sbi.SBI;


public class BankRunner {
    public static void main(String[] args) {

            Bank bank = new Bank();
            bank.loan();
            bank.interestRate();

            SBI sbi = new SBI();
            sbi.loan();
            sbi.interestRate();
        }
    }


