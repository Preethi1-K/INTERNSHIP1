package com.xworkz.tostring;

import com.xworkz.tostring.toString.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.setMaterial("Plastic");
        bucket.setCapacity(10.0);
        bucket.setColor("Red");
        bucket.setWeight(1.5);
        bucket.setShape("Round");

        System.out.println(bucket.toString());
    }
}
