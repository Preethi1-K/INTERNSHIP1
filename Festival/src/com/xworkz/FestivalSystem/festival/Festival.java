package com.xworkz.FestivalSystem.festival;

public class Festival
{
    private String name;
    private String location;
    private String month;
    private int duration;
    private String type;
    private boolean isPublicHoliday;
    private String specialFood;


    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }

    public String getLocation()
    {
        return location;
    }
    public void setMonth(String month )
    {
        this.month=month;
    }
    public String getMonth()
    {
        return month;
    }
    public void setDuration(int duration)
    {
        this.duration=duration;
    }
    public int getDuration()
    {
        return duration;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return type;
    }

    public void setIspublicHoliday(boolean isPublicHoliday)
    {
       this. isPublicHoliday =isPublicHoliday;
    }
    public boolean getIspublicHoliday()
    {
        return isPublicHoliday;
    }
    public  void setSpecialFood(String specialFood)
    {
        this.specialFood=specialFood;
    }
    public String getSpecialFood()
    {
        return specialFood;
    }
}
