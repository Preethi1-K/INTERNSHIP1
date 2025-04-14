package com.xworkz.basic.bed;
import com.xworkz.basic.bed.cot.Cot;
public class BedRunner {
    public static void main(String args[])
        {

            Bed bed = new Cot();
            Cot cot=(Cot)bed;
            bed.comfort();
            bed.material();

        }
    }


