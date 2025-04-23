package com.xworkz.tostring;

import com.xworkz.tostring.toString.Wallet;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.setBrand("Titan");
        wallet.setMaterial("Leather");
        wallet.setPrice(1200.0);
        wallet.setColor("Black");
        wallet.setLeather(true);

        System.out.println(wallet.toString());
    }
}
