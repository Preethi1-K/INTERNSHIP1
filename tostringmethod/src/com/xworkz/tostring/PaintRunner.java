package com.xworkz.tostring;

import com.xworkz.tostring.toString.Paint;

public class PaintRunner {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.setBrand("Dulux");
        paint.setColor("Blue");
        paint.setQuantity(5.0);
        paint.setPrice(1500.0);

        System.out.println(paint.toString());
    }
}
