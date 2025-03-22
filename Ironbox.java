class Ironbox{
static String brand="Orient Electric";
static String specialFeature="2 Years Replacement Warranty";
static String colour="White & Blue";
static String productDimensions="25.8L x 10.3W Centimeters";
public static void main(String arg[])
{
System.out.println("the brand of ironbox is"+brand);
System.out.println("the feature of iron box is"+specialFeature);
System.out.println("the colour of iron box is"+colour);
System.out.println("the dimention of ironbox is"+productDimensions);
featureupdate();
System.out.println("the brand of ironbox is"+brand);
System.out.println("the feature of iron box is"+specialFeature);
System.out.println("the colour of iron box is"+colour);
System.out.println("the dimention of ironbox is"+productDimensions);
}
public static void featureupdate()
{
	brand="Orient  Electric";
	specialFeature="1.5 Years Replacement Warranty";
    colour="White&Blue";
    productDimensions="25.8L x 10.3W Centimeters";
}
}
