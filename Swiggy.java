class Swiggy{
public static double searchFooditems(String foodName)
{
 double foodPrice = 0.0;
 if(foodName == "Rajma")
 {
	foodPrice=376.65;
	return foodPrice;
 }
 else 
 if(foodName=="ChannaMasala")
 {
	foodPrice=400.0;
	return foodPrice;
 }
 else
 if(foodName=="ChickenDoPyaaza")
 {
	foodPrice=484.65;
	return foodPrice;
 }
 else
 if(foodName=="ChickenFry")
 {
	 foodPrice=500.0;
	return foodPrice;
 }
 else
 if(foodName=="MushroomMasala")
 {
	foodPrice=444.15;
	return foodPrice;
 }
 else
 if(foodName=="PaneerBhurji")
 {
	foodPrice=471.500;
	return foodPrice;
 }
 else
 if(foodName=="SubzKadhai")
 {
	foodPrice=390.0;
	return foodPrice;
 }
 else
 if(foodName=="Plainmaggi")
 {
	foodPrice=60.0;
	return foodPrice;
 }
 else
 if(foodName=="Buttermaggi")
 {
	foodPrice=110.0;
	return foodPrice;
 }
 else
 if(foodName=="Eggmaggi")
 {
	foodPrice=120.0;
	return foodPrice;
 }
  else
 if(foodName=="Chanamasala")
 {
	foodPrice=130.0;
	return foodPrice;
 }
 else
 if(foodName=="Chickenmomossteam")
 {
	foodPrice=150.0;
	return foodPrice;
 }
 else
 if(foodName=="ChikenKebab")
 {
     foodPrice=147.0;
     return foodPrice;
 }
 else
 if(foodName=="PepperChicken")
 {
		foodPrice=137.0;
		return foodPrice;
 }
 else
 if(foodName=="ChilliChicken")
 {
		foodPrice=151.0;
		return foodPrice;
 }
 else
 if(foodName=="Chicken65")
 {
		foodPrice=144.99;
		return foodPrice;
 }
 else
 if(foodName=="SingaporeChicken")
 {
		foodPrice=217.0;
		return foodPrice;
 }
 else
 if(foodName=="GarlicChicken")
 {
		foodPrice=140.0;
		return foodPrice;
 }
 else
 if(foodName=="LemonChicken")
 {
		foodPrice=217.99;
		return foodPrice;
 }
 else
 if(foodName=="Mutton Dry")
 {
		foodPrice=182.9;
		return foodPrice;
 }
 else
 if(foodName=="Chicken Tikka")
 {
		foodPrice=130.0;
		return foodPrice;
 }
 else
 if(foodName=="Chicken Special")
 {
		foodPrice=140.9;
		return foodPrice;
 }
 else
 if(foodName=="Ginger Chicken")
 {
		foodPrice=155.0;
		return foodPrice;
 }
 else
 if(foodName=="Ghee Rice")
 {
		foodPrice=77.0;
		return foodPrice;
 }
 else
 if(foodName=="BiryaniRice")
 {
		foodPrice=88.0;
		return foodPrice;
 }
 else
 if(foodName=="Paneer Biriyani")
 {
		foodPrice=140.0;
		return foodPrice;
 }
 else
 if(foodName=="PaneerChilli")
 {
		foodPrice=130.0;
		return foodPrice;
 }
 else
 if(foodName=="Paneer 65")
 {
		foodPrice=135.0;
		return foodPrice;
 }
 else
 if(foodName=="Butter Chicken")
 {
		foodPrice=137.00;
		return foodPrice;
 }
 else
 if(foodName=="Kadhai Chicken")
 {
		foodPrice=137.00;
		return foodPrice;
 }
 else
 if(foodName=="Hyderabadi Chicken")
 {
		foodPrice=134.99;
		return foodPrice;
 }
 else
 if(foodName=="Kerala Parata")
 {
		foodPrice=25.0;
		return foodPrice;
 }
 else
 if(foodName=="Ceylon Paratta")
 {
		foodPrice=25.9;
		return foodPrice;
 }
 else
 if(foodName=="WheatParotta")
 {
		foodPrice=74.0;
		return foodPrice;
 }
 else
if(foodName=="Irani Parotta")
{
		foodPrice=32.0;
		return foodPrice;
}
else
if(foodName=="Tawa Ropti")
{
		foodPrice=18.0;
		return foodPrice;
}
else
		
if(foodName=="Coin Paratta")
{foodPrice=25.0;
		return foodPrice;
}
else
		
if(foodName=="Gajar Ka Halwa")
{foodPrice=49.0;
		return foodPrice;
}
else
		
if(foodName=="Pineapple Halwa")
{
		foodPrice=48.0;
		return foodPrice;
}
else
		
if(foodName=="Handi Phirni")
{
		foodPrice=49.0;
		return foodPrice;
}
else
		
if(foodName=="Gulab jamun ")
{
		foodPrice=39.0;
		return foodPrice;
}
else
	{
	  System.out.println("soory search not found");
	}
	return foodPrice;
} 

public static double searchFooditems(String foodName,int quantity)
{
 double totalfoodPrice = 0.0;
 if(foodName == "Rajma")
 {
	totalfoodPrice=376.65*quantity;
	return totalfoodPrice;
 }
 else 
 if(foodName=="ChannaMasala")
 {
	totalfoodPrice=400.0*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="ChickenDoPyaaza")
 {
	totalfoodPrice=484.65*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="ChickenFry")
 {
	 totalfoodPrice=500.0*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="MushroomMasala")
 {
	totalfoodPrice=444.15*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="PaneerBhurji")
 {
	totalfoodPrice=471.500*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="SubzKadhai")
 {
	totalfoodPrice=390.0*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="Plainmaggi")
 {
	totalfoodPrice=60.0*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="Buttermaggi")
 {
	totalfoodPrice=110.0*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="Eggmaggi")
 {
	totalfoodPrice=120.0*quantity;
	return totalfoodPrice;
 }
  else
 if(foodName=="Chanamasala")
 {
	totalfoodPrice=130.0*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="Chickenmomossteam")
 {
	totalfoodPrice=150.0*quantity;
	return totalfoodPrice;
 }
 else
 if(foodName=="ChikenKebab")
 {
     totalfoodPrice=147.0*quantity;
     return totalfoodPrice;
 }
 else
 if(foodName=="PepperChicken")
 {
		totalfoodPrice=137.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="ChilliChicken")
 {
		totalfoodPrice=151.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Chicken65")
 {
		totalfoodPrice=144.99*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="SingaporeChicken")
 {
		totalfoodPrice=217.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="GarlicChicken")
 {
		totalfoodPrice=140.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="LemonChicken")
 {
		totalfoodPrice=217.99*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Mutton Dry")
 {
		totalfoodPrice=182.9*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Chicken Tikka")
 {
		totalfoodPrice=130.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Chicken Special")
 {
		totalfoodPrice=140.9*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Ginger Chicken")
 {
		totalfoodPrice=155.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Ghee Rice")
 {
		totalfoodPrice=77.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="BiryaniRice")
 {
		totalfoodPrice=88.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Paneer Biriyani")
 {
		totalfoodPrice=140.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="PaneerChilli")
 {
		totalfoodPrice=130.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Paneer 65")
 {
		totalfoodPrice=135.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Butter Chicken")
 {
		totalfoodPrice=137.00*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Kadhai Chicken")
 {
		totalfoodPrice=137.00*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Hyderabadi Chicken")
 {
		totalfoodPrice=134.99*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Kerala Parata")
 {
		totalfoodPrice=25.0*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="Ceylon Paratta")
 {
		totalfoodPrice=25.9*quantity;
		return totalfoodPrice;
 }
 else
 if(foodName=="WheatParotta")
 {
		totalfoodPrice=74.0*quantity;
		return totalfoodPrice;
 }
 else
if(foodName=="Irani Parotta")
{
		totalfoodPrice=32.0*quantity;
		return totalfoodPrice;
}
else
if(foodName=="Tawa Ropti")
{
		totalfoodPrice=18.0*quantity;
		return totalfoodPrice;
}
else
		
if(foodName=="Coin Paratta")
{totalfoodPrice=25.0*quantity;
		return totalfoodPrice;
}
else
		
if(foodName=="Gajar Ka Halwa")
{totalfoodPrice=49.0*quantity;
		return totalfoodPrice;
}
else
		
if(foodName=="Pineapple Halwa")
{
		totalfoodPrice=48.0*quantity;
		return totalfoodPrice;
}
else
		
if(foodName=="Handi Phirni")
{
		totalfoodPrice=49.0*quantity;
		return totalfoodPrice;
}
else
		
if(foodName=="Gulab jamun ")
{
		totalfoodPrice=39.0*quantity;
		return totalfoodPrice;
}
else
	{
	  System.out.println("soory search not found");
	}
	return totalfoodPrice;
} 
}