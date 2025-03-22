class Powerbank{
static String connectorType="USB Type C,USB Type A";
static String brand="pTron";
static int batteryCapacity=10000;
static String colour="Jade Black";
static String specialFeature="Short Circuit Protection, LED Indicator Lights, Lightweight, Over Charging Protection, Fast Charging";
public static void main(String arg[])
{
	System.out.println("the type of power bank is"+connectorType);
	System.out.println("the battery capacity of powerbank is"+batteryCapacity);
	System.out.println("the clour of poer bank is"+colour);
	System.out.println("the specialfeature of power bank is"+specialFeature);
	update();
	System.out.println("the type of power bank is"+connectorType);
	System.out.println("the battery capacity of powerbank is"+batteryCapacity);
	System.out.println("the clour of poer bank is"+colour);
	System.out.println("the specialfeature of power bank is"+specialFeature);
}
public static void update()
{
	connectorType="USB Type C";
	brand="nTron";
	batteryCapacity=100;
	colour="White";
	specialFeature="Short Protection";
}
}
