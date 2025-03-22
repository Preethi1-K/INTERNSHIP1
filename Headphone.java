class Headphone{
static String brand="boAt";
static String colour="Luscious Black";
static String earPlacement="On Ear";
static String impedance="16 Ohm";
public static void main(String a[])
{
System.out.println("the brand of headphone is"+brand);
System.out.println("the colour of headphone is"+colour);
System.out.println("the placement of headphone is"+earPlacement);
System.out.println("the impedance of headphone is"+impedance);
	//brand="realme";
	//colour=" Black";
	//earPlacement="On Ear";
	//impedance="18 Ohm";
brandupdate();
System.out.println("the brand of headphone is"+brand);
System.out.println("the colour of headphone is"+colour);
System.out.println("the placement of headphone is"+earPlacement);
System.out.println("the impedance of headphone is"+impedance);
}
public static void brandupdate()
{
   brand="realme";
   colour=" Black";
   earPlacement="On Ear";
   impedance="18 Ohm";
}
}