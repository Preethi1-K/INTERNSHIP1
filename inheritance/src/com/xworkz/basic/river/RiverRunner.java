package com.xworkz.basic.river;
import com.xworkz.basic.river.ganga.Ganga;

public class RiverRunner {

    public static void main(String args[]) {
        River river = new River();
        river.flow();
        river.source();

        Ganga ganga = new Ganga();
        ganga.flow();
        ganga.source();
    }
}
