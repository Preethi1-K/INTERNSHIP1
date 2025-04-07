package com.xworkz.FestivalSystem;
import com.xworkz.FestivalSystem.festival.Festival;

public class FestivalRunner {


    public  static void main(String arg[])
    {
        System.out.println("the main started");

        Festival celebration =new Festival();


        celebration.setName("Divali");
        celebration.setLocation("India");
        celebration.setMonth("Noember");
        celebration.setDuration(5);
        celebration.setType("religious");
        celebration.setIspublicHoliday(true);
        celebration.setSpecialFood("Sweets and snacks");


        String name1=celebration.getName();
        String location1 =celebration.getLocation();
        String month1 =celebration.getMonth();
        int duration1=celebration.getDuration();
        String type1=celebration.getType();
        boolean  isholidayornot1 =celebration.getIspublicHoliday();
        String food1= celebration.getSpecialFood();

        System.out.println("The festival name  is"+name1);
        System.out.println("The festival location  model is " +location1);
        System.out.println("The festival month   is" + month1 );
        System.out.println("The festival duration    is" +duration1 );
        System.out.println("The festival type is " +type1 );
        System.out.println("The holiday or not"+isholidayornot1);
        System.out.println("The festival food is"+food1);
        System.out.println("\n");



        Festival carnival =new Festival();


        carnival.setName("Christmas");
        carnival.setLocation("Worldwide");
        carnival.setMonth("December");
        carnival.setDuration(1);
        carnival.setType("Religious");
        carnival.setIspublicHoliday(true);
        carnival.setSpecialFood("Cake & Cookies");


        String name2=carnival.getName();
        String location2 =carnival.getLocation();
        String month2 =carnival.getMonth();
        int duration2=carnival.getDuration();
        String type2=carnival.getType();
        boolean  isholidayornot2 =carnival.getIspublicHoliday();
        String food2= carnival.getSpecialFood();

        System.out.println("The festival name  is"+name2);
        System.out.println("The festival location  model is " +location2);
        System.out.println("The festival month   is" + month2);
        System.out.println("The festival duration    is" +duration2 );
        System.out.println("The festival type is " +type2 );
        System.out.println("The holiday or not"+isholidayornot2);
        System.out.println("The festival food is"+food2);
        System.out.println("\n");


        Festival feast =new Festival();


        feast.setName("Holi");
        feast.setLocation("India");
        feast.setMonth("March");
        feast.setDuration(3);
        feast.setType("Cultural");
        feast.setIspublicHoliday(true);
        feast.setSpecialFood("Gujiya & Thanda");


        String name3=feast.getName();
        String location3 =feast.getLocation();
        String month3 =feast.getMonth();
        int duration3=feast.getDuration();
        String type3=feast.getType();
        boolean  isholidayornot3 =feast.getIspublicHoliday();
        String food3= feast.getSpecialFood();

        System.out.println("The festival name  is"+name3);
        System.out.println("The festival location  model is " +location3);
        System.out.println("The festival month   is" + month3 );
        System.out.println("The festival duration    is" +duration3 );
        System.out.println("The festival type is " +type3 );
        System.out.println("The holiday or not"+isholidayornot3);
        System.out.println("The festival food is"+food3);
        System.out.println("\n");

        Festival gola =new Festival();


        gola.setName("Eid");
        gola.setLocation("Worldwide");
        gola.setMonth("Varies");
        gola.setDuration(1);
        gola.setType("Religious");
        gola.setIspublicHoliday(true);
        gola.setSpecialFood("Biryani & Seviyan");


        String name4=gola.getName();
        String location4 =gola.getLocation();
        String month4 =gola.getMonth();
        int duration4=gola.getDuration();
        String type4=gola.getType();
        boolean  isholidayornot4 =gola.getIspublicHoliday();
        String food4= gola.getSpecialFood();

        System.out.println("The festival name  is"+name4);
        System.out.println("The festival location  model is " +location4);
        System.out.println("The festival month   is" + month4 );
        System.out.println("The festival duration    is" +duration4 );
        System.out.println("The festival type is " +type4 );
        System.out.println("The holiday or not"+isholidayornot4);
        System.out.println("The festival food is"+food4);
        System.out.println("\n");



        Festival fair =new Festival();

        fair.setName("Pongal");
        fair.setLocation("Tamil Nadu");
        fair.setMonth("January");
        fair.setDuration(4);
        fair.setType("Seasonal");
        fair.setIspublicHoliday(true);
        fair.setSpecialFood("Sweet Pongal & Sugarcane");


        String name5=fair.getName();
        String location5 =fair.getLocation();
        String month5 =fair.getMonth();
        int duration5=fair.getDuration();
        String type5=fair.getType();
        boolean  isholidayornot5 =fair.getIspublicHoliday();
        String food5= fair.getSpecialFood();

        System.out.println("The festival name  is"+name5);
        System.out.println("The festival location  model is " +location5);
        System.out.println("The festival month   is" + month5 );
        System.out.println("The festival duration    is" +duration5 );
        System.out.println("The festival type is " +type5 );
        System.out.println("The holiday or not"+isholidayornot5);
        System.out.println("The festival food is"+food5);
        System.out.println("\n");
    }
}
