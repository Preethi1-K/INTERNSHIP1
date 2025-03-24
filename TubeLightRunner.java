class TubeLightRunner
{


  public static void main(String arg[])
  {
	TubeLight tubeLamp=new TubeLight();
		          tubeLamp.name="Philips twinglow";
				  tubeLamp.power="20W";
				  tubeLamp.price=899;
		System.out .println(" The tube light name is"+tubeLamp.name);
		System.out.println("The tube light power is"+tubeLamp.power);
		System.out.println("The tube light price is"+tubeLamp.price);
		
	TubeLight tubeLamp1=new TubeLight("Philips twinglow","20W",899);
		
		System.out. println(" The tube light name is"+tubeLamp1.name);
		System.out.println("The tube light power is"+tubeLamp1.power);
		System.out.println("The tube light price is"+tubeLamp1.price);
		
		
	TubeLight fluorescentLamp=new TubeLight();
				fluorescentLamp.name="Merolta pro";
				fluorescentLamp.power="25W";
				fluorescentLamp.price=1800;
	System.out.println("The fluorescentLamp name is"+fluorescentLamp.name);
	System.out.println("The fluorescentLamp power is"+fluorescentLamp.power);
	System.out.println("The fluorescentLamp price is"+fluorescentLamp.price);
	
	
	
	TubeLight fluorescentLamp2=new TubeLight("Merolta pro","25w",1800);
	
		System.out.println("The fluorescentLamp name is"+fluorescentLamp2.name);
	    System.out.println("The fluorescentLamp power is"+fluorescentLamp2.power);
		System.out.println("The fluorescentLamp price is"+fluorescentLamp2.price);
		
		
	TubeLight neonTube=new TubeLight();
				neonTube.name="astralineLED ";
				neonTube.power="20W";
				neonTube.price=1600;
	System.out.println("The neonTube name is"+neonTube.name);
	System.out.println("The neonTube power is"+neonTube.power);
	System.out.println("The neonTube price is"+neonTube.price);
	
	TubeLight neonTube3=new TubeLight("astralineLED","20W",1600);
		System.out.println("The neonTube name is"+neonTube3.name);
		System.out.println("The neonTube power is"+neonTube3.power);
		System.out.println("The neonTube price is"+neonTube3.price);
		
	TubeLight stripLight=new TubeLight();
				stripLight.name="Astra line";
				stripLight.power="20W";
				stripLight.price=1200;
	System.out.println("The stripLight name is"+neonTube.name);
	System.out.println("The stripLight power is"+neonTube.power);
	System.out.println("The stripLight price is"+neonTube.price);
	
	TubeLight stripLight4=new TubeLight("Astra line","20W",1200);
		System.out.println("The stripLight name is"+stripLight4.name);
		System.out.println("The stripLight power is"+stripLight4.power);
		System.out.println("The stripLight price is"+stripLight4.price);
		
    TubeLight linearLight=new TubeLight();
				linearLight.name="Star bright LED";
				linearLight.power="23W";
				linearLight.price=1500;
	System.out.println("The linearLight name is"+linearLight.name);
	System.out.println("The linearLight power is"+linearLight.power);
	System.out.println("The linearLight price is"+linearLight.price);
	
	TubeLight linearLight5=new TubeLight("Star bright LED","23W",1500);
		System.out.println("The linearLight name is"+linearLight5.name);
		System.out.println("The linearLight power is"+linearLight5.power);
		System.out.println("The linearLight price is"+linearLight5.price);
	
	TubeLight cylindricalLamp =new TubeLight();
				cylindricalLamp.name="Bright LED";
				cylindricalLamp.power="20W";
				cylindricalLamp.price=1300;
	System.out.println("The cylindricalLamp name is"+cylindricalLamp.name);
	System.out.println("The cylindricalLamp power is"+cylindricalLamp.power);
	System.out.println("The cylindricalLamp price is"+cylindricalLamp.price);
	
	TubeLight cylindricalLamp6=new TubeLight("Bright LED","20W",1300);
		System.out.println("The cylindricalLamp name is"+cylindricalLamp6.name);
		System.out.println("The cylindricalLamp power is"+cylindricalLamp6.power);
		System.out.println("The cylindricalLamp price is"+cylindricalLamp6.price);
		
		
		
	TubeLight ledTube =new TubeLight();
				ledTube.name="Twin glow LED";
				ledTube.power="25W";
				ledTube.price=1600;
	System.out.println("The ledTube  name is"+ledTube.name);
	System.out.println("The ledTube  power is"+ledTube.power);
	System.out.println("The ledTube  price is"+ledTube.price);
	
	TubeLight ledTube7 =new TubeLight();
		System.out.println("The ledTube name is"+ ledTube7.name);
		System.out.println("The ledTube  power is"+ ledTube7.power);
		System.out.println("The ledTube  price is"+ ledTube7.price);
}
}
	
					