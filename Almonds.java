class Almonds{
static	String brand="PrettyNutty";
static String flavour=	"dry fruit";
static String dietType="Vegetarian";
static String itemWeight="500 gram" ;
static String speciality="No Artificial Flavors";
static String allergenInformation="Allergen-Free";
public static void main(String arg[])
{
System.out.println("the brand of Almonda"+brand);
System.out.println("the flavour of Almonda"+flavour);
System.out.println("the diettype of Almonda"+dietType);
System.out.println("the itemweight of Almonda"+itemWeight);
System.out.println("the speciality of Almonda"+speciality);
//brand="Nutty";
// flavour=" fruit";
//dietType="Vegetarian";
 //itemWeight="100 gram" ;
 //speciality=" Artificial Flavors";
 //allergenInformation="not their";
brandupdate();
System.out.println("the brand of Almonda"+brand);
System.out.println("the flavour of Almonda"+flavour);
System.out.println("the diettype of Almonda"+dietType);
System.out.println("the itemweight of Almonda"+itemWeight);
System.out.println("the speciality of Almonda"+speciality);
}
public static void brandupdate(){
 brand="Nutty";
 flavour=" fruit";
 dietType="Vegetarian";
 itemWeight="100 gram" ;
 speciality=" Artificial Flavors";
 allergenInformation="not their";

}
}