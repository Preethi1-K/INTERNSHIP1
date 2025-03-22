class Pencil{
static String brand="Apsara";
static String writingInstrumentform="Graphite Pencil";
static String colour="Silver colour";
static String inkColour="Black";
public static void main(String arg[])
{
System.out.println("the pencil brand is"+brand);
System.out.println("the writing instrument form of pencil is"+writingInstrumentform);
System.out.println("the colour of pen is"+colour);
System.out.println("the inkcolour of pen is"+inkColour);
update();
System.out.println("the pencil brand is"+brand);
System.out.println("the writing instrument form of pencil is"+writingInstrumentform);
System.out.println("the colour of pen is"+colour);
System.out.println("the inkcolour of pen is"+inkColour);
}
public static void update()
{
	brand="Nataraja";
	writingInstrumentform="Graphite Pencil";
	colour="Red colour";
	inkColour="Black";
}
}