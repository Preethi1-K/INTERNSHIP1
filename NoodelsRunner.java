class NoodelsRunner
{

  public static void main(String arg[])
{
  Noodels maggiMasala=new Noodels();
          maggiMasala.flavor="mint Masala";
		  maggiMasala.type="instant noodels";
		  maggiMasala.price=50;
		  
	System.out.println("The maggiMasala flavor is"+maggiMasala.flavor);
	System.out.println("The maggiMasala typr is"+maggiMasala.type);
	System.out.println("The maggiMasala price is"+maggiMasala.price);
		  
  Noodels maggiMasala1=new Noodels("Masala","instant noodels",50);
  
			System.out.println("The maggiMasala flavor is"+maggiMasala1.flavor);
			System.out.println("The maggiMasala typr is"+maggiMasala1.type);
			System.out.println("The maggiMasala price is"+maggiMasala1.price);
	
  Noodels magiNutrious=new Noodels();
          magiNutrious.flavor="Veg atta";
		  magiNutrious.type="Whole wheat noodels";
		  magiNutrious.price=90;
		  
	System.out.println("The magiNutrious flavor is"+magiNutrious.flavor);
	System.out.println("The magiNutrious typr is"+magiNutrious.type);
	System.out.println("The magiNutrious price is"+magiNutrious.price);
	
 Noodels magiNutrious2=new Noodels("Veg atta","Whole wheat noodels",90);
	
			System.out.println("The magiNutrious flavor is"+magiNutrious2.flavor);
			System.out.println("The magiNutrious typr is"+magiNutrious2.type);
			System.out.println("The magiNutrious price is"+magiNutrious2.price);
			
			
 Noodels sunFeast=new Noodels();
          sunFeast.flavor="Veg masala";
		  sunFeast.type="instant noodels";
		  sunFeast.price=99;
		  
	System.out.println("The sunFeast flavor is"+sunFeast.flavor);
	System.out.println("The sunFeast type is"+sunFeast.type);
	System.out.println("The sunFeast price is"+sunFeast.price);
	
	
Noodels sunFeast3=new Noodels("Veg masala","instant noodels",99);
	
	
			System.out.println("The sunFeast flavor is"+sunFeast3.flavor);
			System.out.println("The sunFeast type is"+sunFeast3.type);
			System.out.println("The sunFeast price is"+sunFeast3.price);
			
			
  Noodels maggiChicken=new Noodels();
          maggiChicken.flavor="chicken";
		  maggiChicken.type="non veg";
		  maggiChicken.price=100;
		  
	System.out.println("The maggiChicken flavor is"+maggiChicken.flavor);
	System.out.println("The maggiChicken type is"+maggiChicken.type);
	System.out.println("The maggiChicken price is"+maggiChicken.price);
	

  Noodels maggiChicken4=new Noodels("chicken","non veg",100);
			
		System.out.println("The maggiChicken flavor is"+maggiChicken4.flavor);
		System.out.println("The maggiChicken type is"+maggiChicken4.type);
		System.out.println("The maggiChicken price is"+maggiChicken4.price);
		
		
	 Noodels yippee=new Noodels();
          yippee.flavor="magic masala";
		  yippee.type="veg";
		  yippee.price=40;
		  
	System.out.println("The yippee flavor is"+yippee.flavor);
	System.out.println("The yippee type is"+yippee.type);
	System.out.println("The yippee price is"+yippee.price);
	
	Noodels yippee5=new Noodels("magic masala","veg",40);
	       System.out.println("The yippee flavor is"+yippee5.flavor);
		   System.out.println("The yippee type is"+yippee5.type);
		   System.out.println("The yippee price is"+yippee5.price);
		   
		   
	Noodels testy=new Noodels();
         testy.flavor="Garlic";
		 testy.type="veg";
		 testy.price=60;
		  
	System.out.println("The testy flavor is"+testy.flavor);
	System.out.println("The testy type is"+testy.type);
	System.out.println("The testy price is"+testy.price);
	
	
	Noodels testy6=new Noodels("Garlic","veg",60);
		      
		System.out.println("The testy flavor is"+testy6.flavor);
		System.out.println("The testy type is"+testy6.type);
	    System.out.println("The testy price is"+testy6.price);
		
	Noodels curryVegnoodels=new Noodels();
         curryVegnoodels.flavor="Hot & spicy";
		 curryVegnoodels.type="veg";
		 curryVegnoodels.price=70;
		  
	System.out.println("The curryVegnoodels flavor is"+curryVegnoodels.flavor);
	System.out.println("The curryVegnoodels type is"+curryVegnoodels.type);
	System.out.println("The curryVegnoodels price is"+curryVegnoodels.price);
	
	
	Noodels curryVegnoodels7=new Noodels("Hot & spicy","veg",70);
			
			System.out.println("The curryVegnoodels flavor is"+curryVegnoodels7.flavor);
			System.out.println("The curryVegnoodels type is"+curryVegnoodels7.type);
			System.out.println("The curryVegnoodels price is"+curryVegnoodels7.price);
}	
			
}