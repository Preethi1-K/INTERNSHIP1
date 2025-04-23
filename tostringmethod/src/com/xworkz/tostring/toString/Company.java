package com.xworkz.tostring.toString;


    public class Company
    {

        private String name;
        private String industry;
        private int employees;
        private String headquarters;

        public Company() {
        }
@Override
        public String toString() {
            return "Company:(name:" + this.name + ",\n industry:" + this.industry + ",\n employees:" + this.employees + ",\n headquarters:" + this.headquarters + ")";
        }

        public String getName() {
            return name;
        }

        public String getIndustry() {
            return industry;
        }

        public int getEmployees() {
            return employees;
        }

        public String getHeadquarters() {
            return headquarters;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIndustry(String industry) {
            this.industry = industry;
        }

        public void setEmployees(int employees) {
            this.employees = employees;
        }

        public void setHeadquarters(String headquarters) {
            this.headquarters = headquarters;
        }
    }


