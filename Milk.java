class Milk{
static String brand="Real";
static String flavour="Soya";
static String netQuantity="1000.0 millilitre";
static String dietType="Vegetarian";
static String itemForm="Liquid";
static int numberOfitems=1;
public static void main(String arg[])
{
System.out.println("The brand of milk is"+brand);
System.out.println("The flavour of milk is"+flavour);
System.out.println("The netQuantity of milk is"+netQuantity);
System.out.println("the diet type of milk is"+dietType);
System.out.println("the itemform of milk is"+itemForm);
System.out.println("the number of item"+numberOfitems);
	//brand="Nandini";
	//flavour="Soya";
	//netQuantity="1000.0 millilitre";
	//dietType="Vegetarian";
	//itemForm="Liquid";
	//numberOfitems=1;
brandupdate();
System.out.println("The brand of milk is"+brand);
System.out.println("The flavour of milk is"+flavour);
System.out.println("The netQuantity of milk is"+netQuantity);
System.out.println("the diet type of milk is"+dietType);
System.out.println("the itemform of milk is"+itemForm);
System.out.println("the number of item"+numberOfitems);
}
public static void brandupdate()
{
	brand="Nandini";
	flavour="Soya";
	netQuantity="1000.0 millilitre";
	dietType="Vegetarian";
	itemForm="Liquid";
	numberOfitems=1;
	
}
}