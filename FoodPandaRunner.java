class FoodPandaRunner{
public static void main(String item[])
{
double foodPrice=FoodPanda.searchingFooditems("Chocolate Brownie");
System.out.println(foodPrice);
double foodPricequantity=FoodPanda.searchingFooditems("Chocolate Brownie",3);
System.out.println(foodPricequantity);
}
}