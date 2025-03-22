class Zepto{
public static double foodSearch(String foodName)
{
double foodPrice=0.0;
if(foodName=="curd rice")
{
foodPrice=95.0;
return foodPrice;
}
else
if(foodName=="Gongura Rice")
{
foodPrice=160.0;
return foodPrice;
}
else
if(foodName=="puliyogare")
{
foodPrice=110.0;
return foodPrice;
}
else
if(foodName=="ghee pudi rice")
{
foodPrice=200.0;
return foodPrice;
}
else
if(foodName=="veg pulao")
{
foodPrice=157.0;
return foodPrice;
}
else
if(foodName=="coconut rice")
{
foodPrice=145.0;
return foodPrice;
}
else
if(foodName=="veg bath")
{
foodPrice=130.0;
return foodPrice;
}
else
if(foodName=="PapuRice")
{
foodPrice=150.0;
return foodPrice;
}
else
if(foodName=="Spanish Rice")
{
foodPrice=175;
return foodPrice;
}
else
if(foodName=="Mudda Papu Rice")
{
foodPrice=180.0;
return foodPrice;
}
else
if(foodName=="Rasam rice")
{
foodPrice=150.0;
return foodPrice;
}
else
if(foodName=="Ghee paddu")
{
foodPrice=125.0;
return foodPrice;
}
else
if(foodName=="mysore pak")
{
foodPrice=60.0;
return foodPrice;
}
else
if(foodName=="Safron Kesari Bath")
{
foodPrice=125.0;
return foodPrice;
}
else
if(foodName=="Poothrekulu")
{
foodPrice=190.0;
return foodPrice;
}
else
if(foodName=="jack fruit kesari bath")
{
foodPrice=125.0;
return foodPrice;
}
else
if(foodName=="carrot halwa")
{
foodPrice=110.0;
return foodPrice;
}
else
if(foodName=="ghee holige")
{
foodPrice=95.0;
return foodPrice;
}
else
if(foodName=="Payasam")
{
foodPrice=99.0;
return foodPrice;
}
else
if(foodName=="semiya payasam")
{
foodPrice=80.0;
return foodPrice;
}
else
if(foodName=="kheer")
{
foodPrice=70.0;
return foodPrice;
}
else
if(foodName=="Pheni with Saffron badam milk")
{
foodPrice=180.0;
return foodPrice;
}
else
if(foodName=="Akki rotti")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodName=="Akki roti with yennegai palya")
{
foodPrice=140.0;
return foodPrice;
}
else
if(foodName=="Ragi roti")
{
foodPrice=190.0;
return foodPrice;
}
else
if(foodName=="kerala parotta")
{
foodPrice=89.9;
return foodPrice;
}
else
if(foodName=="Poori Saggu")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodName=="channa masala rice")
{
foodPrice=100.0;
return foodPrice;
}
else
if(foodName=="Healthy Sprout salad")
{
foodPrice=190.0;
return foodPrice;
}
else
if(foodName=="kala chana sundal")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodName=="Lunch combo")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodName=="Arbain pulp juice")
{
foodPrice=140.0;
return foodPrice;
}
else
if(foodName=="Salt Lassi")
{
foodPrice=110;
return foodPrice;
}
else
if(foodName=="Masala Chaas")
{
foodPrice=90.0;
return foodPrice;
}
else
if(foodName=="lemon Shavigge")
{
foodPrice=140.0;
return foodPrice;
}
else
if(foodName=="Aloo Bonda")
{
foodPrice=95.0;
return foodPrice;
}
else
if(foodName=="Choice of Bhaji")
{
foodPrice=90.0;
return foodPrice;
}
else
{
System.out.println("Sorry............ search not found");
}
return foodPrice;
}


public static double foodSearch(String foodName,int quantity)
{
double Price=0.0;
if(foodName=="curd rice")
{
Price=95.0*quantity;
return Price;
}
else
if(foodName=="Gongura Rice")
{
Price=160.0*quantity;
return Price;
}
else
if(foodName=="puliyogare")
{
Price=110.0*quantity;
return Price;
}
else
if(foodName=="ghee pudi rice")
{
Price=200.0*quantity;
return Price;
}
else
if(foodName=="veg pulao")
{
Price=157.0*quantity;
return Price;
}
else
if(foodName=="coconut rice")
{
Price=145.0*quantity;
return Price;
}
else
if(foodName=="veg bath")
{
Price=130.0*quantity;
return Price;
}
else
if(foodName=="PapuRice")
{
Price=150.0*quantity;
return Price;
}
else
if(foodName=="Spanish Rice")
{
Price=175*quantity;
return Price;
}
else
if(foodName=="Mudda Papu Rice")
{
Price=180.0*quantity;
return Price;
}
else
if(foodName=="Rasam rice")
{
Price=150.0*quantity;
return Price;
}
else
if(foodName=="Ghee paddu")
{
Price=125.0*quantity;
return Price;
}
else
if(foodName=="mysore pak")
{
Price=60.0*quantity;
return Price;
}
else
if(foodName=="Safron Kesari Bath")
{
Price=125.0*quantity;
return Price;
}
else
if(foodName=="Poothrekulu")
{
Price=190.0*quantity;
return Price;
}
else
if(foodName=="jack fruit kesari bath")
{
Price=125.0*quantity;
return Price;
}
else
if(foodName=="carrot halwa")
{
Price=110.0*quantity;
return Price;
}
else
if(foodName=="ghee holige")
{
Price=95.0*quantity;
return Price;
}
else
if(foodName=="Payasam")
{
Price=99.0*quantity;
return Price;
}
else
if(foodName=="semiya payasam")
{
Price=80.0*quantity;
return Price;
}
else
if(foodName=="kheer")
{
Price=70.0*quantity;
return Price;
}
else
if(foodName=="Pheni with Saffron badam milk")
{
Price=180.0*quantity;
return Price;
}
else
if(foodName=="Akki rotti")
{
Price=90.0*quantity;
return Price;
}
else
if(foodName=="Akki roti with yennegai palya")
{
Price=140.0*quantity;
return Price;
}
else
if(foodName=="Ragi roti")
{
Price=190.0*quantity;
return Price;
}
else
if(foodName=="kerala parotta")
{
Price=89.9*quantity;
return Price;
}
else
if(foodName=="Poori Saggu")
{
Price=90.0*quantity;
return Price;
}
else
if(foodName=="channa masala rice")
{
Price=100.0*quantity;
return Price;
}
else
if(foodName=="Healthy Sprout salad")
{
Price=190.0*quantity;
return Price;
}
else
if(foodName=="kala chana sundal")
{
Price=90.0*quantity;
return Price;
}
else
if(foodName=="Lunch combo")
{
Price=90.0*quantity;
return Price;
}
else
if(foodName=="Arbain pulp juice")
{
Price=140.0*quantity;
return Price;
}
else
if(foodName=="Salt Lassi")
{
Price=110*quantity;
return Price;
}
else
if(foodName=="Masala Chaas")
{
Price=90.0*quantity;
return Price;
}
else
if(foodName=="lemon Shavigge")
{
Price=140.0*quantity;
return Price;
}
else
if(foodName=="Aloo Bonda")
{
Price=95.0*quantity;
return Price;
}
else
if(foodName=="Choice of Bhaji")
{
Price=90.0*quantity;
return Price;
}
else
{
System.out.println("Sorry............ search not found");
}
return Price;
}
}


