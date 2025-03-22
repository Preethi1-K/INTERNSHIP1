class Swiggy1{
public static double takeOrder(String foodItem)
{
double foodPrice=0.0;
if(foodItem=="Burger")
{
foodPrice=50.0;
return foodPrice;
}
else
System.out.println("not find");
return foodPrice;
}

public static double takeOrder(String foodItem,int quantity)
{
double foodPrice=0.0;
if(foodItem=="Burger")
{
foodPrice=50.0*quantity;
return foodPrice;
}
else
System.out.println("not find");
return foodPrice;
}
}