class BlinkItRunner{
public static void main(String item[])
{
double dishesPrice=BlinkIt.searchForfood("ghee idli");
System.out.println(dishesPrice);
double dishesPriceNoitems=BlinkIt.searchForfood("ghee idli",3);
System.out.println(dishesPriceNoitems);
}
}