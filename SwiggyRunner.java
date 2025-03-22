class SwiggyRunner{
public static void main(String arg[])
{
double foodPrice=Swiggy.searchFooditems("ChannaMasala");
System.out.println("The cost of your food iteam is"+foodPrice);
double totalfoodPrice=Swiggy.searchFooditems("ChannaMasala",3);
System.out.println("The cost of your food iteam is"+totalfoodPrice);
}
}