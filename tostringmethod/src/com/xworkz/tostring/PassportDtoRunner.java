package com.xworkz.tostring;


import com.xworkz.tostring.toString.PassportSevaDto;

public class PassportDtoRunner {

 public static void main(String args[])
 {

  PassportSevaDto user1 = new PassportSevaDto();

  user1.setGivenName("Baba");
  user1.setSurName("Ram Dev");
  user1.setDob("12-12-1890");
  user1.setEmail("baba@gmail.com");
  user1.setLoginId("baba@gmail.com");
  user1.setPassword("baba@123");
  user1.setConfirmPassword("baba@123");
  user1.setHintQues("Your favorite color");
  user1.setHintAns("Pink");
  user1.setCaptcha("DNBGC123");

  System.out.println(user1);

 }
}
