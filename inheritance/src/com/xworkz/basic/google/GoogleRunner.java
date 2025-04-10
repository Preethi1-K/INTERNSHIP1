package com.xworkz.basic.google;
import com.xworkz.basic.google.chrome.Chrome;
public class GoogleRunner {


    public static void main(String args[]) {

        Google google = new Google();
        google.search();
        google.service();

        Chrome chrome = new Chrome();
        chrome.search();
        chrome.service();
    }
}
