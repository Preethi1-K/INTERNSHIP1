package com.xworkz.basic.days;
import com.xworkz.basic.days.weeks.Week;
public class DaysRunner {
    public static void main(String arg[])
    {
        Days day=new Week();
        Week weeks= (Week)day;
        day.day();
        weeks.week();

    }
}
