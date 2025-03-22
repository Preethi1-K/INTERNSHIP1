class BlinkIt{
public static double searchForfood(String dishesName)
{
double dishesPrice=0.0;
if(dishesName=="Ghee Pudi Idli")
	{
	dishesPrice=125.0;
	return dishesPrice;
	}
else
if(dishesName=="Ghee Sambar Button")
	{
	dishesPrice=115.0;
	return dishesPrice;
	}
else
if(dishesName=="Kanchipuram idli")
	{
	dishesPrice=115.0;
	return dishesPrice;
	}
else
if(dishesName=="Tatte idli")
	{
	dishesPrice=65.0;
	return dishesPrice;
	}
else
if(dishesName=="Garlic roast dosa")
	{
	dishesPrice=180;
	return dishesPrice;
	}
else
if(dishesName=="Butter Kalli Dosa")
	{
	dishesPrice=165.0;
	return dishesPrice;
	}
else
if(dishesName=="Ghee onion dosa")
	{
	dishesPrice=200.0;
	return dishesPrice;
	}
else
if(dishesName=="ghee pudi masala dosa")
	{
	dishesPrice=180.0;
	return dishesPrice;
	}
else
if(dishesName=="open butter masala dosa")
	{
	dishesPrice=190;
	return dishesPrice;
	}
else
if(dishesName=="voda with chatuney")
	{
	dishesPrice=70.0;
	return dishesPrice;
	}
else
if(dishesName==" dahi voda")
	{
	dishesPrice=115.0;
	return dishesPrice;
	}
else
if(dishesName=="mini vada sambar")
	{
	dishesPrice=100.0;
	return dishesPrice;
	}
else
if(dishesName=="veg pongal")
	{
	dishesPrice=125.0;
	return dishesPrice;
}
else
if(dishesName=="ghee pudi karad bath")
	{
	dishesPrice=115.0;
	return dishesPrice;
	}
else
if(dishesName=="khara bath")
	{
	dishesPrice=95;
	return dishesPrice;
	}
else
if(dishesName=="rava upma")
	{
	dishesPrice=50.0;
	return dishesPrice;
	}
else
if(dishesName=="gulab jamun")
	{
	dishesPrice=65.0;
	return dishesPrice;
	}
else
if(dishesName=="butter idli")
	{
	dishesPrice=100.0;
	return dishesPrice;
	}
else
if(dishesName=="ghee idli")
	{
	dishesPrice=100.0;
	return dishesPrice;
	}
else
if(dishesName=="Ghee pudi idli")
	{
	dishesPrice=125.0;
	return dishesPrice;
	}
else
if(dishesName=="Ghee sambar butter idli")
	{
	dishesPrice=115.0;
	return dishesPrice;
	}
else
if(dishesName=="kanchipuram idli")
	{
	dishesPrice=115.0;
	return dishesPrice;
	}
else
if(dishesName=="tomato rice")
	{
	dishesPrice=40.0;
	return dishesPrice;
}
else
if(dishesName=="lemon idli")
{
dishesPrice=130.0;
return dishesPrice;
}
else
if(dishesName=="rava idli")
{
dishesPrice=120.0;
return dishesPrice;
}
else
if(dishesName=="garlic roast dosa")
{
dishesPrice=180.0;
return dishesPrice;
}
else
if(dishesName=="butter kalli dosa")
{
dishesPrice=165.0;
return dishesPrice;
}
else
if(dishesName=="ghee onion dosa")
{
dishesPrice=200.0;
return dishesPrice;
}
else
if(dishesName=="ghee plain dosa")
{
dishesPrice=145.0;
return dishesPrice;
}
else
if(dishesName=="ghee pudi masala dosa")
{
dishesPrice=180;
return dishesPrice;
}
else
if(dishesName=="open butter masala dosa")
{
dishesPrice=190;
return dishesPrice;
}
else
if(dishesName=="butter dosa")
{
dishesPrice=170.0;
return dishesPrice;
}
else
if(dishesName=="ghee ragi dosa")
{
dishesPrice=145.0;
return dishesPrice;
}
else
if(dishesName=="multi grain dosa")
{
dishesPrice=155.0;
return dishesPrice;
}
else
if(dishesName=="Rava dosa")
{
dishesPrice=185.0;
return dishesPrice;
}
else
if(dishesName=="kalli voda")
{
dishesPrice=50.0;
return dishesPrice;
}
else
if(dishesName=="grain vodda")
{
dishesPrice=80.0;
return dishesPrice;
}
else
if(dishesName=="mini voda sambar dip")
{
dishesPrice=100.0;
return dishesPrice;
}
else
if(dishesName=="masala voda")
{
dishesPrice=95.0;
return dishesPrice;
}
else
if(dishesName=="rasam voda")
{
dishesPrice=95.0;
return dishesPrice;
}
else
if(dishesName=="chitranna")
{
dishesPrice=140.0;
return dishesPrice;
}
else
if(dishesName=="leamon rice")
{
dishesPrice=130.0;
return dishesPrice;
}
else
{
System.out.println("result not found");
}
return dishesPrice;
}

public static double searchForfood(String dishesName, int items)
{
	double dishesPriceNoitems=0.0;
if(dishesName=="Ghee Pudi Idli")
	{
	dishesPriceNoitems=125.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Ghee Sambar Button")
	{
	dishesPriceNoitems=115.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Kanchipuram idli")
	{
	dishesPriceNoitems=115.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Tatte idli")
	{
	dishesPriceNoitems=65.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Garlic roast dosa")
	{
	dishesPriceNoitems=180*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Butter Kalli Dosa")
	{
	dishesPriceNoitems=165.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Ghee onion dosa")
	{
	dishesPriceNoitems=200.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="ghee pudi masala dosa")
	{
	dishesPriceNoitems=180.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="open butter masala dosa")
	{
	dishesPriceNoitems=190*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="voda with chatuney")
	{
	dishesPriceNoitems=70.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName==" dahi voda")
	{
	dishesPriceNoitems=115.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="mini vada sambar")
	{
	dishesPriceNoitems=100.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="veg pongal")
	{
	dishesPriceNoitems=125.0*items;
	return dishesPriceNoitems;
}
else
if(dishesName=="ghee pudi karad bath")
	{
	dishesPriceNoitems=115.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="khara bath")
	{
	dishesPriceNoitems=95*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="rava upma")
	{
	dishesPriceNoitems=50.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="gulab jamun")
	{
	dishesPriceNoitems=65.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="butter idli")
	{
	dishesPriceNoitems=100.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="ghee idli")
	{
	dishesPriceNoitems=100.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Ghee pudi idli")
	{
	dishesPriceNoitems=125.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Ghee sambar butter idli")
	{
	dishesPriceNoitems=115.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="kanchipuram idli")
	{
	dishesPriceNoitems=115.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="tomato rice")
	{
	dishesPriceNoitems=40.0*items;
	return dishesPriceNoitems;
}
else
if(dishesName=="lemon idli")
	{
	dishesPriceNoitems=130.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="rava idli")
	{
	dishesPriceNoitems=120.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="garlic roast dosa")
	{
	dishesPriceNoitems=180.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="butter kalli dosa")
	{
	dishesPriceNoitems=165.0*items;
	return dishesPriceNoitems;
}
else
if(dishesName=="ghee onion dosa")
	{
	dishesPriceNoitems=200.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="ghee plain dosa")
	{
	dishesPriceNoitems=145.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="ghee pudi masala dosa")
	{
	dishesPriceNoitems=180*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="open butter masala dosa")
	{
	dishesPriceNoitems=190*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="butter dosa")
	{
	dishesPriceNoitems=170.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="ghee ragi dosa")
	{
	dishesPriceNoitems=145.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="multi grain dosa")
	{
	dishesPriceNoitems=155.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="Rava dosa")
	{
	dishesPriceNoitems=185.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="kalli voda")
	{
	dishesPriceNoitems=50.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="grain vodda")
	{
	dishesPriceNoitems=80.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="mini voda sambar dip")
	{
	dishesPriceNoitems=100.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="masala voda")
	{
	dishesPriceNoitems=95.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="rasam voda")
	{
	dishesPriceNoitems=95.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="chitranna")
	{
	dishesPriceNoitems=140.0*items;
	return dishesPriceNoitems;
	}
else
if(dishesName=="leamon rice")
	{
	dishesPriceNoitems=130.0*items;
	return dishesPriceNoitems;
	}
else
{
System.out.println("result not found");
}
return dishesPriceNoitems;
}
}

