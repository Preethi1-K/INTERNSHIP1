package com.xworkz.tostring;

import com.xworkz.tostring.toString.Symbol;

public class SymbolRunner {
    public static void main(String[] args) {
        Symbol symbol = new Symbol();
        symbol.setName("Heart");
        symbol.setMeaning("Love");
        symbol.setOrigin("Ancient Greece");
        symbol.setUsage("Represents affection");
        symbol.setType("Iconic");

        System.out.println(symbol.toString());
    }
}
