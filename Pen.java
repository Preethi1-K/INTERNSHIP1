class Pen{
static String brand="Reynolds";
static String writinginstrumentform="Ballpoint Pen";
static String colour="MULTI";
static String inkColour="Blue";
public static void main(String arg[])
{
System.out.println("the brand of pen is"+brand);
System.out.println("the instrumentform of pen is"+writinginstrumentform);
System.out.println("the colour of pen is"+colour);
System.out.println("the ink colour of pen is"+ inkColour);
update();
System.out.println("the brand of pen is"+brand);
System.out.println("the instrumentform of pen is"+writinginstrumentform);
System.out.println("the colour of pen is"+colour);
System.out.println("the ink colour of pen is"+ inkColour);
}
public static void update()
{
	brand="Bright";
	writinginstrumentform="Ballpoint Pen";
	colour="BLUE";
	inkColour="Black";

}
}