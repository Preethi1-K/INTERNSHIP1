class Man{
static String personName="xyz";
static int age=23;
public static void main(String inf[])
{
 System.out.println("the person name is+"+personName);
 System.out.println("the age of person is"+age);
 //personName="abc";
 //age=23
 personNameupdate();
 System.out.println("the person name is+"+personName);
 System.out.println("the age of person is"+age);
}
public static void personNameupdate()
{
	personName="abc";
	age=23;
}
}
