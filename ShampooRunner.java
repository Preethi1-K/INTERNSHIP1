class ShampooRunner
{

  public static void main(String sampoo[])
  {
    Shampoo clinicplus=new Shampoo();
			clinicplus.price=2;
			clinicplus.samples=4;
			clinicplus.quantity="10ml";
	System.out.println("The shampoo price is"+clinicplus.price);
	System.out.println("The shampoo  samples is"+clinicplus.samples);
	System.out.println("The shampoo quantity is"+clinicplus.quantity);
	
	
	Shampoo clinicplus1=new Shampoo(2,4,"10 ml");
			System.out.println("The shampoo price is"+clinicplus1.price);
			System.out.println("The shampoo  samples is"+clinicplus1.samples);
			System.out.println("The shampoo quantity is"+clinicplus1.quantity);
			
	 Shampoo dove=new Shampoo();
			dove.price=5;
			dove.samples=2;
			dove.quantity="15ml";
	System.out.println("The shampoo price is"+dove.price);
	System.out.println("The shampoo  samples is"+dove.samples);
	System.out.println("The shampoo quantity is"+dove.quantity);
	
	 Shampoo dove2=new Shampoo(5,2,"15 ml");
			System.out.println("The shampoo price is"+dove2.price);
			System.out.println("The shampoo  samples is"+dove2.samples);
			System.out.println("The shampoo quantity is"+dove2.quantity);
			
			
	Shampoo sunsilk=new Shampoo();
			sunsilk.price=2;
			sunsilk.samples=3;
			sunsilk.quantity="20ml";
	System.out.println("The shampoo price is"+sunsilk.price);
	System.out.println("The shampoo  samples is"+sunsilk.samples);
	System.out.println("The shampoo quantity is"+sunsilk.quantity);
	
	
	Shampoo sunsilk3=new Shampoo(2,3,"20ml");
			System.out.println("The shampoo price is"+sunsilk3.price);
			System.out.println("The shampoo  samples is"+sunsilk3.samples);
			System.out.println("The shampoo quantity is"+sunsilk3.quantity);
			
	Shampoo chick=new Shampoo();
			chick.price=5;
			chick.samples=3;
			chick.quantity="100ml";
	System.out.println("The shampoo price is"+chick.price);
	System.out.println("The shampoo  samples is"+chick.samples);
	System.out.println("The shampoo quantity is"+chick.quantity);
	
	
	Shampoo chick4=new Shampoo(5,3,"100ml");
			System.out.println("The shampoo price is"+chick4.price);
			System.out.println("The shampoo  samples is"+chick4.samples);
			System.out.println("The shampoo quantity is"+chick4.quantity);
			
			
	Shampoo karthika=new Shampoo();
			karthika.price=20;
			karthika.samples=2;
			karthika.quantity="300ml";
	System.out.println("The shampoo price is"+chick.price);
	System.out.println("The shampoo  samples is"+chick.samples);
	System.out.println("The shampoo quantity is"+chick.quantity);
	
	Shampoo karthika5=new Shampoo(20,2,"300ml");
			System.out.println("The shampoo price is"+karthika5.price);
			System.out.println("The shampoo  samples is"+karthika5.samples);
			System.out.println("The shampoo quantity is"+karthika5.quantity);
			
	Shampoo wow=new Shampoo();
			wow.price=200;
			wow.samples=21;
			wow.quantity="500ml";
	System.out.println("The shampoo price is"+wow.price);
	System.out.println("The shampoo  samples is"+wow.samples);
	System.out.println("The shampoo quantity is"+wow.quantity);
	
	Shampoo wow6=new Shampoo(200,21,"500ml");
			System.out.println("The shampoo price is"+wow6.price);
			System.out.println("The shampoo  samples is"+wow6.samples);
			System.out.println("The shampoo quantity is"+wow6.quantity);
			
			
	Shampoo pantene=new Shampoo();
			pantene.price=300;
			pantene.samples=3;
			pantene.quantity="300ml";
	System.out.println("The shampoo price is"+pantene.price);
	System.out.println("The shampoo  samples is"+pantene.samples);
	System.out.println("The shampoo quantity is"+pantene.quantity);
	
	
	Shampoo pantene7=new Shampoo(300,3,"300ml");
			System.out.println("The shampoo price is"+pantene7.price);
			System.out.println("The shampoo  samples is"+pantene7.samples);
		System.out.println("The shampoo quantity is"+pantene7.quantity);
    }
}