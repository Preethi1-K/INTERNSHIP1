package com.xworkz.basic.bed;
import com.xworkz.basic.bed.cot.Cot;
public class BedRunner {
    public static void main(String args[])
        {

            Bed bed = new Bed();
            bed.comfort();
            bed.material();

            Cot cot = new Cot();
            cot.comfort();
            cot.material();
        }
    }


