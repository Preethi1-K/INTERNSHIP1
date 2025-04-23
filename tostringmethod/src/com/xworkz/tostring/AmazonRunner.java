package com.xworkz.tostring;

import com.xworkz.tostring.toString.AmazonDto;

public class AmazonRunner {
        public AmazonRunner() {
        }

        public static void main(String[] args) {
            AmazonDto amazonDto = new AmazonDto();
            amazonDto.setEmailId("baba132@gmail.com");
            amazonDto.setPhoneNumber("4578909797");
            amazonDto.setFullName("Baba Singh");
            amazonDto.setPassword("Babu902789");
            amazonDto.setConfirmPassword("Babu902789");



            System.out.println(amazonDto.toString());
        }
    }


