class HalliMart{
static String groceries[]={"Apple","Bread","Milk","Eggs","Rice","Chicken","Cheese","Tomatoes","Potatoes","Carrots"};
static String perfumes[]={"Euphoria","MidnightBloom","VelvetNoir","GoldenHour"," OceanWhisper","AmberDusk","RosewoodMist","CitrusMuse","LavenderDreams","JasmineEclipse"};
static String biscuits[]={"Oreo","Digestive","Bourborn","Marie","Parle-G","Shortbread","NiceBiscuit","JammieDodger","GingerNut","ChocolaateChipCookie"};
static String utensils[]={"Spatula","Knife","Spoon","Fork","Whisk","Tongs","Peeler","Grater","Ladle","MeasuringCups"};
static String vegetables[]={"Onion","Garlic","Carrot","Raddish","Potato","Tomato","Cucumber"," Cauliflower","Broccoli","Spinach"};
//System.out.println("the numbers of items of groceries "+groceries.length);
//System.out.println("the number of items of perfumes"+perfumes.length);
//System.out.println("the number of items of biscuits:"+biscuits.length);
//System.out.println("the number of items of utensils:"+utensils.length);
//System.out.println("the number of vegetables:"+vegetables.length)

public static void main(String arg[])
{
	System.out.println("the strat of main method");
	getGroceries();
	getPerfumes();
	getBiscuits();
	getUtensiles();
	getVegetables();
	System.out.println("the end of main method");
}
public static void getGroceries()
{ 
System.out.println("the inside of getgroceries()");
for(String grocery:groceries){
	System.out.println(grocery);
}
System.out.println("the end of groceries()");
}

public static void getPerfumes()
{
	System.out.println("the inside of getperfumes()");
	for(String perfume:perfumes){
		System.out.println(perfume);
	}
	System.out.println("the end of getperfumes()");
}
public static void getBiscuits()
{
	System.out.println("the inside of biscuits()");
	for( String biscuit:biscuits){
		System.out.println(biscuit);
	}
	System.out.println("the end of biscuits()");
}
public static void getUtensiles()
{
	System.out.println("the inside of getUtensiles()");
	for(String utensile:utensils){
		System.out.println(utensile);
		}
		System.out.println("the end getUtensiles()");
}
public static void getVegetables()
{
	System.out.println("the inside of vegetables()");
	for(String vegetable:vegetables){
		System.out.println(vegetable);
	}
	System.out.println("the end of vegetables()");
}
}

//System.out.println(groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);
//System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+perfumes[4]+" "+perfumes[5]+" "+perfumes[6]+" "+perfumes[7]+ " "+perfumes[8]+" "+perfumes[9]);
//System.out.println(utensils[0]+" "+utensils[1]+" "+utensils[2]+" "+utensils[3]+" "+utensils[4]+" "+utensils[5]+" "+utensils[6]+" "+utensils[7]+" "+utensils[8]+" "+utensils[9]);
//System.out.println(vegetables[0]+" "+vegetables[1]+" "+vegetables[2]+" "+vegetables[3]+" "+vegetables[4]+" "+vegetables[5]+" "+vegetables[6]+" "+vegetables[7]+" "+vegetables[8]+" "+vegetables[9]);