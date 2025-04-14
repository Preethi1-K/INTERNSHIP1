package com.xworkz.basic.bank;
import com.xworkz.basic.bank.sbi.SBI;


public class BankRunner {
    public static void main(String[] args) {

            Bank bank = new SBI();
            SBI sbi=(SBI)bank;
            bank.loan();
            sbi.interestRate();



        }
    }


