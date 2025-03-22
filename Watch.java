class Watch{
static int id=401; 
static String brand="Rolex"; 
static String color="Gold"; 
static String type="Analog"; 
static String shape="Round"; 
static boolean isWaterProof=true;
public static void main(String go[])
{
	System.out.println("The watch id is "+id);
	System.out.println("The watch brand is "+brand);
	System.out.println("The watch color is "+color);
	System.out.println("The watch type is "+ type);
	System.out.println("The watch shape is "+shape);
	System.out.println("The watch is waterproof"+isWaterProof);
	update();
	System.out.println("The watch id is "+id);
	System.out.println("The watch brand is "+brand);
	System.out.println("The watch color is "+color);
	System.out.println("The watch type is "+ type);
	System.out.println("The watch shape is "+shape);
	System.out.println("The watch is waterproof"+isWaterProof);
}
public static void update()
{
	id=40; 
	brand="Fastrack"; 
	color="Silver"; 
	type="Analog&digital"; 
	shape="Suare"; 
	isWaterProof=false;
}
}
