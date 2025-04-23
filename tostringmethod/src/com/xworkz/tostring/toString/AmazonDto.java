package com.xworkz.tostring.toString;

public class AmazonDto {

        private String emailId;
        private String phoneNumber;
        private String fullName;
        private String password;
        private String confirmPassword;

        public AmazonDto() {
        }
@Override
        public String toString()
        {
            return "AmazonDto:(emailId:" + this.emailId + ",\n phoneNumber:" + this.phoneNumber + ",\n fullName:" + this.fullName + ",\n password:" + this.password + ",\n confirmPassword:" + this.confirmPassword + ")";
        }

        public String getEmailId()
        {
            return this.emailId;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getFullName() {
            return this.fullName;
        }

        public String getPassword() {
            return this.password;
        }

        public String getConfirmPassword() {
            return this.confirmPassword;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }
    }



