package com.xworkz.basic.river;
import com.xworkz.basic.river.ganga.Ganga;

public class RiverRunner {

    public static void main(String args[]) {
        River river =  new Ganga();
        Ganga ganga = (Ganga)river;
        river.flow();
        river.source();
        ganga.flow();
        ganga.source();
    }
}
