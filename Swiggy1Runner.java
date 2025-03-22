class Swiggy1Runner{
public static void main(String arg[])
{
double order=Swiggy1.takeOrder("Burger");
System.out.println(order);
double order1=Swiggy1.takeOrder("Burger",7);
System.out.println(order1);
}
}
