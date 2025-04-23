package com.xworkz.tostring.toString;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter



public class PassportSevaDto {

    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private String loginId;
    private String password;
    private String confirmPassword;
    private String hintQues;
    private String hintAns;
    private String captcha;


    @Override
    public String toString()
    {
        return "PassportDto(givenName:"+this.givenName+","+ "last name is:"+this.surName+","+"dateOfbirth:"+this.dob+","+"emailis:"+this.email+","+","+"login id is:"+this.loginId+","+"passsword is:"+this.password+","+"confirm password is:"+this.confirmPassword+","+"hint question is"+this.hintQues+","+"hint answer is"+this.hintAns+","+"captcha is"+this.captcha;
    }
}
