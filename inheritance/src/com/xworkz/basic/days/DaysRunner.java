package com.xworkz.basic.days;
import com.xworkz.basic.days.weeks.Week;
public class DaysRunner {
    public static void main(String arg[])
    {
        Days day=new Days();
        day.day();
        day.week();
        Week weeks=new Week();
        weeks.day();
        weeks.week();
    }
}
