class CarryBagRunner
{
	
	public static void main(String arg[])
	{
	CarryBag toteBag = new CarryBag();
           toteBag.brand = "michael koras";
		   toteBag.material = "leather";
		   toteBag.color = "black";
		System.out.println("The brand name is" + toteBag.brand);
		System.out.println("The material used is" + toteBag.material);
		System.out.println("The color  of the bag is" + toteBag.color);
		
	CarryBag toteBag1 = new CarryBag("michael koras","leather","black");
			System.out.println("The brand name is" + toteBag1.brand);
			System.out.println("The material used is" + toteBag1.material);
			System.out.println("The color  of the bag is" + toteBag1.color);
			
	CarryBag backPack = new CarryBag();
           backPack.brand = "Adidas";
		   backPack.material = "Polyester";
		   backPack.color = "Grey";
		System.out.println("The brand name is" + backPack.brand);
		System.out.println("The material used is" + backPack.material);
		System.out.println("The color  of the bag is" + backPack.color);
		
	CarryBag backPack2 = new CarryBag("Adidas","Polyester","Grey");
		System.out.println("The brand name is"+ backPack2.brand);
		System.out.println("The material used is"+ backPack2.material);
		System.out.println("The color  of the bag is"+ backPack2.color);
		
	CarryBag duffleBag= new CarryBag();
           duffleBag.brand = "Nike";
		   duffleBag.material = "canvas";
		   duffleBag.color = "Red";
		System.out.println("The brand name is"+ duffleBag.brand);
		System.out.println("The material used is"+ duffleBag.material);
		System.out.println("The color  of the bag is"+ duffleBag.color);
		
	CarryBag duffleBag3 = new CarryBag();
		System.out.println("The brand name is"+ duffleBag3.brand);
		System.out.println("The material used is"+ duffleBag3.material);
		System.out.println("The color  of the bag is"+ duffleBag3.color);
		
		
	CarryBag messengerBag = new CarryBag();
           messengerBag.brand = "Fossil";
		   messengerBag.material = "Leather";
		   messengerBag.color = "green";
		System.out.println("The brand name is"+ messengerBag.brand);
		System.out.println("The material used is"+ messengerBag.material);
		System.out.println("The color  of the bag is"+ messengerBag.color);

	CarryBag messengerBag4 = new CarryBag("Fossil","Leather","green");
			System.out.println("The brand name is"+ messengerBag4.brand);
			System.out.println("The material used is"+ messengerBag4.material);
			System.out.println("The color  of the bag is"+ messengerBag4.color);
			
	CarryBag slingBag = new CarryBag();
           slingBag.brand = "Puma";
		   slingBag.material = "Faux Leather";
		   slingBag.color = "Black";
		System.out.println("The brand name is"+ slingBag.brand);
		System.out.println("The material used is"+ slingBag.material);
		System.out.println("The color  of the bag is"+ slingBag.color);
	
	CarryBag slingBag5 = new CarryBag("Puma","Faux Leather","Black");
			System.out.println("The brand name is"+ slingBag5.brand);
			System.out.println("The material used is"+ slingBag5.material);
			System.out.println("The color  of the bag is"+ slingBag5.color);
			
			
	CarryBag laptopBag = new CarryBag();
			laptopBag.brand = "Samsonite";
			laptopBag.material = "Nylon";
			laptopBag.color = "Blue";
		System.out.println("The brand name is"+ laptopBag.brand);
		System.out.println("The material used is"+ laptopBag.material);
		System.out.println("The color  of the bag is"+ laptopBag.color);

	CarryBag laptopBag6= new CarryBag("Samsonite","Nylon","Blue");
			System.out.println("The brand name is"+ laptopBag6.brand);
			System.out.println("The material used is"+ laptopBag6.material);
			System.out.println("The color  of the bag is"+ laptopBag6.color);
			
	
	CarryBag shoppingBag = new CarryBag();
			shoppingBag.brand = "Ikea";
			shoppingBag.material = "Polypropylene";
			shoppingBag.color = "Orange";
		System.out.println("The brand name is"+ shoppingBag.brand);
		System.out.println("The material used is"+ shoppingBag.material);
		System.out.println("The color  of the bag is"+ shoppingBag.color);

	CarryBag shoppingBag7= new CarryBag("Tikea","Polypropyline","orange");
			System.out.println("The brand name is"+ shoppingBag7.brand);
			System.out.println("The material used is"+ shoppingBag7.material);
			System.out.println("The color  of the bag is"+ shoppingBag7.color);

	}
	}
