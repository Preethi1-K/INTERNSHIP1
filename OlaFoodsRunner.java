class OlaFoodsRunner{
public static void main(String items[])
{
double priceOfdishes=OlaFoods.searchFordishes("Mumbai Pav Bhaji");
System.out.println("The price of item is"+priceOfdishes);
double priceOffood=OlaFoods.searchFordishes("Mumbai Pav Bhaji",2);
System.out.println("The price of item is"+priceOffood);
}
}