package com.xworkz.basic.company;
import com.xworkz.basic.company.infosys.Infosys;

public class CompanyRunner
{
    public static void main(String[] args)
    {
            Company company = new Infosys() ;
            Infosys infosys = (Infosys)company;
            company.location();
            infosys.employeeCount();



    }

}
