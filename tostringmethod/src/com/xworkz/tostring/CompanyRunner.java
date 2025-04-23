package com.xworkz.tostring;

import com.xworkz.tostring.toString.Company;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Infosys");
        company.setIndustry("IT Services");
        company.setEmployees(250000);
        company.setHeadquarters("Bangalore");

        System.out.println(company.toString());
    }
}
