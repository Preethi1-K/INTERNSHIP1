package com.xworkz.basic.google;
import com.xworkz.basic.google.chrome.Chrome;
public class GoogleRunner {


    public static void main(String args[]) {

        Google google = new  Chrome();
        Chrome chrome = (Chrome)google;
        google.search();
        google.service();
        chrome.search();
        chrome.service();
    }
}
