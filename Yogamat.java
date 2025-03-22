class Yogamat{
static String colour="Blue-Blue";
static String brand="Boldfit";
static String material="Thermoplastic Elastomers";
static String productCareInstructions="Hand Wash Only";
static String productDimensions="13L x 13W x 61Th Centimeters";
public static void main(String arg[])
{
	System.out.println("The colour of yogamat is"+colour);
	System.out.println("The brand of yogamat is"+brand);
	System.out.println("The material of yogamat is"+material);
	System.out.println("The instructions of yogamat is"+productCareInstructions);
	System.out.println("The dimention of yogamat is"+productDimensions);
	update();
	System.out.println("The colour of yogamat is"+colour);
	System.out.println("The brand of yogamat is"+brand);
	System.out.println("The material of yogamat is"+material);
	System.out.println("The instructions of yogamat is"+productCareInstructions);
	System.out.println("The dimention of yogamat is"+productDimensions);
}
public static void update()
{
	colour="Green-Green";
	brand="Bold";
	material="Thermoplastic ";
	productCareInstructions="Washable";
	productDimensions="11L x 12W x 51Th Centimeters";
}


