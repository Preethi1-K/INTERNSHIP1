class FoodPanda{
public static double searchingFooditems(String foodItem)
{
double foodPrice=0.0;
if(foodItem=="Chocolate Brownie")
{
foodPrice=100.0;
return foodPrice;
}
else
if(foodItem=="Casear Salad")
{
foodPrice=110.0;
return foodPrice;
}
else
if(foodItem=="Garlic Bread")
{
foodPrice=200.0;
return foodPrice;
}
else
if(foodItem=="french fries")
{
foodPrice=109.0;
return foodPrice;
}
else
if(foodItem=="Grillled chicken")
{
foodPrice=299;
return foodPrice;
}
else
if(foodItem=="dosa")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodItem=="pasta alfredo")
{
foodPrice=100.0;
return foodPrice;
}
else
if(foodItem=="chicken sandwich")
{
foodPrice=199.9;
return foodPrice;
}
else
if(foodItem=="veg burger")
{
foodPrice=100.0;
return foodPrice;
}
else
if(foodItem=="fish curry")
{
foodPrice=200.0;
return foodPrice;
}
else
if(foodItem=="Dim sum")
{
foodPrice=190.0;
return foodPrice;
}
else
if(foodItem=="Schezwan noodles")
{
foodPrice=199;
return foodPrice;
}
else
if(foodItem=="Kung Pao Chicken")
{
foodPrice=209.0;
return foodPrice;
}
else
if(foodItem=="momos")
{
foodPrice=190.0;
return foodPrice;
}
else
if(foodItem=="spring rolls")
{
foodPrice=99.0;
return foodPrice;
}
else
if(foodItem=="Manchurian")
{
foodPrice=99.9;
return foodPrice;
}
else
if(foodItem=="chicken fired rice")
{
foodPrice=100;
return foodPrice;
}
else
if(foodItem=="veg hakka noodles")
{
foodPrice=50.0;
return foodPrice;
}
else
if(foodItem=="chiken lolli pop")
{
foodPrice=69.9;
return foodPrice;
}
else
if(foodItem=="fish kabab")
{
foodPrice=199.0;
return foodPrice;
}
else
if(foodItem=="lemon rice")
{
foodPrice=89.0;
return foodPrice;
}
else
if(foodItem=="prawn fry")
{
foodPrice=120.0;
return foodPrice;
}
else
if(foodItem=="Appam with stew")
{
foodPrice=180.0;
return foodPrice;
}
else
if(foodItem=="mutton sukka")
{
foodPrice=120.0;
return foodPrice;
}
else
if(foodItem=="fish curry")
{
foodPrice=130.0;
return foodPrice;
}
else
if(foodItem=="chicken chettinad")
{
foodPrice=140.0;
return foodPrice;
}
else
if(foodItem=="bisibele bath")
{
foodPrice=70.0;
return foodPrice;
}
else
if(foodItem=="vada")
{foodPrice=45.0;
return foodPrice;
}
else
if(foodItem=="madur vada")
{
foodPrice=40.0;
return foodPrice;
}
else
if(foodItem=="idli with sambar")
{
foodPrice=50.0;
return foodPrice;
}
else
if(foodItem=="masala dosa")
{
foodPrice=70.0;
return foodPrice;
}
else
if(foodItem=="guntur chicken")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodItem=="plain dasa")
{
foodPrice=60.0;
return foodPrice;
}
else
if(foodItem=="butter chicken")
{
foodPrice=99.0;
return foodPrice;
}
else
if(foodItem=="paneer tikka")
{
foodPrice=100.0;
return foodPrice;
}
else
if(foodItem=="dal maskani")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodItem=="chole bhature")
{
foodPrice=80.0;
return foodPrice;
}else
if(foodItem=="aloo baji")
{
foodPrice=99.0;
return foodPrice;
}
else
if(foodItem=="mutton keema masala")
{
foodPrice=199.0;
return foodPrice;
}
else
if(foodItem=="mutton kurma")
{
foodPrice=120.0;
return foodPrice;
}
else
if(foodItem=="veg palav")
{
foodPrice=50.0;
return foodPrice;
}
else
if(foodItem=="onion pakoda")
{
foodPrice=30.0;
return foodPrice;
}
else
if(foodItem=="pav baji")
{
foodPrice=45.0;
return foodPrice;
}
else
{
System.out.println("sorry result not found");
}
return foodPrice;
}

public static double searchingFooditems(String foodItem,int quantity)
{
double foodPricequantity=0.0;
if(foodItem=="Chocolate Brownie")
{
foodPricequantity=100.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="Casear Salad")
{
foodPricequantity=110.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="Garlic Bread")
{
foodPricequantity=200.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="french fries")
{
foodPricequantity=109.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="Grillled chicken")
{
foodPricequantity=299*quantity;
return foodPricequantity;
}
else
if(foodItem=="dosa")
{
foodPricequantity=90.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="pasta alfredo")
{
foodPricequantity=100.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="chicken sandwich")
{
foodPricequantity=199.9*quantity;
return foodPricequantity;
}
else
if(foodItem=="veg burger")
{
foodPricequantity=100.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="fish curry")
{
foodPricequantity=200.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="Dim sum")
{
foodPricequantity=190.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="Schezwan noodles")
{
foodPricequantity=199*quantity;
return foodPricequantity;
}
else
if(foodItem=="Kung Pao Chicken")
{
foodPricequantity=209.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="momos")
{
foodPricequantity=190.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="spring rolls")
{
foodPricequantity=99.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="Manchurian")
{
foodPricequantity=99.9*quantity;
return foodPricequantity;
}
else
if(foodItem=="chicken fired rice")
{
foodPricequantity=100*quantity;
return foodPricequantity;
}
else
if(foodItem=="veg hakka noodles")
{
foodPricequantity=50.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="chiken lolli pop")
{
foodPricequantity=69.9*quantity;
return foodPricequantity;
}
else
if(foodItem=="fish kabab")
{
foodPricequantity=199.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="lemon rice")
{
foodPricequantity=89.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="prawn fry")
{
foodPricequantity=120.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="Appam with stew")
{
foodPricequantity=180.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="mutton sukka")
{
foodPricequantity=120.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="fish curry")
{
foodPricequantity=130.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="chicken chettinad")
{
foodPricequantity=140.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="bisibele bath")
{
foodPricequantity=70.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="vada")
{foodPricequantity=45.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="madur vada")
{
foodPricequantity=40.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="idli with sambar")
{
foodPricequantity=50.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="masala dosa")
{
foodPricequantity=70.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="guntur chicken")
{
foodPricequantity=90.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="plain dasa")
{
foodPricequantity=60.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="butter chicken")
{
foodPricequantity=99.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="paneer tikka")
{
foodPricequantity=100.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="dal maskani")
{
foodPricequantity=90.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="chole bhature")
{
foodPricequantity=80.0*quantity;
return foodPricequantity;
}else
if(foodItem=="aloo baji")
{
foodPricequantity=99.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="mutton keema masala")
{
foodPricequantity=199.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="mutton kurma")
{
foodPricequantity=120.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="veg palav")
{
foodPricequantity=50.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="onion pakoda")
{
foodPricequantity=30.0*quantity;
return foodPricequantity;
}
else
if(foodItem=="pav baji")
{
foodPricequantity=45.0*quantity;
return foodPricequantity;
}
else
{
System.out.println("sorry result not found");
}
return foodPricequantity;
}
}