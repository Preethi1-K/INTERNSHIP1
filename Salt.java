class Salt{
static String flavour="Iodised Salt";//static v/class v
static String brand="TATA SALT";//instince
static String itemWeight="1 Kilograms";
static String speciality="Vegetarian";
static int netQuantity	=100;
public static void main(String arg[])
{
	System.out.println("the flavour of salt is"+flavour);
	System.out.println("the brand of salt is"+brand);
	System.out.println("the itemweight of salt is"+itemWeight);
	System.out.println("the speciality of salt is"+speciality);
	System.out.println("the netQuantity of salt is"+netQuantity);
	update();
	System.out.println("the flavour of salt is"+flavour);
	System.out.println("the brand of salt is"+brand);
	System.out.println("the itemweight of salt is"+itemWeight);
	System.out.println("the speciality of salt is"+speciality);
	System.out.println("the netQuantity of salt is"+netQuantity);
}
public static void update()
{
	flavour="Iodised Salt";//static v/class v
	brand="Pink SALT";//instince
	itemWeight="2 Kilograms";
	speciality="Vegetarian";
	netQuantity	=150;
}
}
//compile driven value default value
