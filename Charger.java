class Charger{
static int id=1001; 
static String brand="Anker"; 
static String color="Black";  
static int power=20;  
static String type="Wireless";  
static int  price= 200; 
static boolean isWashable=false;
public static void main(String[] a)
      {
        System.out.println("the charger id is"+id);
		System.out.println("the charger brand is"+brand);
		System.out.println("the charger color is"+color);
		System.out.println("the charger power is"+ power);
		System.out.println("the charger type is"+type);
		System.out.println("the charger price is"+price);
		System.out.println("the charger washable  is"+isWashable);
		//id=100; 
	 //brand="Samsung"; 
     //String color="White";  
     //power=10;  
	 //type="Wire";  
     //price= 100; 
     //isWashable=true;
		brandupdate();
		System.out.println("the charger id is"+id);
		System.out.println("the charger brand is"+brand);
		System.out.println("the charger color is"+color);
		System.out.println("the charger power is"+ power);
		System.out.println("the charger type is"+type);
		System.out.println("the charger price is"+price);
		System.out.println("the charger washable  is"+isWashable);
      }
public static void brandupdate()
{
	 id=100; 
	 brand="Samsung"; 
     String color="White";  
     power=10;  
	 type="Wire";  
     price= 100; 
     isWashable=true;
}
}