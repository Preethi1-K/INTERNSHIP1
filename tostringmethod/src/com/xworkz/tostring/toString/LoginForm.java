package com.xworkz.tostring.toString;

public class LoginForm {

    private String username;
    private String password;
    private boolean rememberMe;
    private String loginTime;

    public LoginForm() {
    }
@Override
    public String toString() {
        return "LoginForm:(username:" + this.username + ",\n password:" + this.password + ",\n rememberMe:" + this.rememberMe + ",\n loginTime:" + this.loginTime + ")";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
