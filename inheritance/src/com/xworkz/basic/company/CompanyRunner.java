package com.xworkz.basic.company;
import com.xworkz.basic.company.infosys.Infosys;

public class CompanyRunner {
    public static void main(String[] args)
    {
            Company company = new Company();
            company.location();
            company.employeeCount();

            Infosys infosys = new Infosys();
            infosys.location();
            infosys.employeeCount();

    }

}
