class DominosRunner{
public static void main(String arg[])
{
double priceOfItem=Dominos.searchInDominos("Margherita");
System.out.println("the price of item is"+priceOfItem);
double priceOftakenQuantity=Dominos.searchInDominos("Margherita",3);
System.out.println("The price of item is"+priceOftakenQuantity);
}
}