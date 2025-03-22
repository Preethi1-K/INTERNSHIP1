class Airport{
static int id=501; 
static String name="JFK Airport"; 
static String location="New York"; 
static int noOfterminals=6; 
static String type="International";
public static void main(String arg[])
{

System.out.println("The airport id is"+id);
System.out.println("The airport name is"+name);
System.out.println("The airport location is"+location);
System.out.println("Number of terminal of airport is"+noOfterminals);
System.out.println("The airport type is"+type);
 //id=1; 
 //name="Devanahalli air port"; 
 //location="Banglore"; 
 //noOfterminals=5; 
 //type="State";
airportInformationupdate();
System.out.println("The airport id is"+id);
System.out.println("The airport name is"+name);
System.out.println("The airport location is"+location);
System.out.println("Number of terminal of airport is"+noOfterminals);
System.out.println("The airport type is"+type);

}
public static void airportInformationupdate()
{
 id=1; 
 name="Devanahalli air port"; 
 location="Banglore"; 
 noOfterminals=5; 
 type="State";
}
}