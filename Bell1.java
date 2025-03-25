class Bell1
{
		Bell1()
		{
		System.out.println("The bell constructer is invoked withou argument");
		}
		
		Bell1(String material,String shape,String sound)
		{
			
		System.out.println("The bell constructer is invoked withou argument");
		 this.material=material;
		 this.shape=shape;
		 this.sound=sound;
		}
		
		
		String material;
		String shape;
		String sound;
		
		public void detailsOfBell()
		{
		 System.out.println("The material of bell is"+this.material);
		 System.out.println("The shape of bell is"+this.shape);
		System.out.println("The sound of bell is"+this.sound);
		
		
		}
		
		
}