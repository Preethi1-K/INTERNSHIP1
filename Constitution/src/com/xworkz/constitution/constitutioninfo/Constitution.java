package com.xworkz.constitution.constitutioninfo;

public class Constitution
{
    private String countryName;
    private String preamble;
    private int numberOfArticles;
    private int numberOfAmendments;
    private String adoptionDate;
    private String governingSystem;
    private String fundamentalRights;

    public  void setCountryName(String countryName)
    {
        this.countryName=countryName;
    }
    public String getCountryName()
    {
        return countryName;
    }
    public  void  setPreamble(String preamble)
    {
        this.preamble=preamble;
    }
    public  String getPreamble()
    {
        return  preamble;
    }
    public void setNumberOfArticles(int numberOfArticles)
    {
        this.numberOfArticles=numberOfArticles;
    }

    public int getNumberOfArticles()
    {
        return numberOfArticles;
    }
    public void setNumberOfAmendments(int numberOfAmendments)
    {
        this.numberOfAmendments=numberOfAmendments;
    }

    public int getNumberOfAmendments()
    {
        return numberOfAmendments;
    }
    public void setAdoptionDate(String adoptionDate)
    {
        this.adoptionDate=adoptionDate;
    }
    public  String getAdoptionDate()
    {
        return adoptionDate;
    }
    public  void setGoverningSystem(String governingSystem)
    {
        this.governingSystem=governingSystem;
    }
    public String getGoverningSystem()
    {
        return  governingSystem;
    }

    public void setFundamentalRights(String fundamentalRights)
    {
        this.fundamentalRights = fundamentalRights;
    }

    public String getFundamentalRights()
    {
        return fundamentalRights;
    }
}

