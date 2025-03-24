class VaseRunner{

	public static void main(String arg[])
	{
		Vase mingVase=new Vase();
				mingVase.material="Procelian";
				mingVase.shape="Baluster";
				mingVase.color="white";
				
		System.out.println("The vase material is"+mingVase.material);
		System.out.println("The vase material is"+mingVase.shape);
		System.out.println("The vase material is"+mingVase.color);
		
		
		Vase mingVase1=new Vase("Procelian","Baluster","white");
						
			System.out.println("The vase material is"+mingVase1.material);
			System.out.println("The vase material is"+mingVase1.shape);
			System.out.println("The vase material is"+mingVase1.color);
			
			
		Vase crystalVase=new Vase();
				crystalVase.material="crystal";
				crystalVase.shape="Amphora";
				crystalVase.color="black";
				
		System.out.println("The vase material is"+crystalVase.material);
		System.out.println("The vase material is"+crystalVase.shape);
		System.out.println("The vase material is"+crystalVase.color);
				
		Vase crystalVase2=new Vase("Procelian","Baluster","white");
				System.out.println("The vase material is"+crystalVase2.material);
				System.out.println("The vase material is"+crystalVase2.shape);
				System.out.println("The vase material is"+crystalVase2.color);
				
				
		Vase celadonVase=new Vase();
				celadonVase.material="ceramic";
				celadonVase.shape="bottle shape";
				celadonVase.color="pale green";
				
		System.out.println("The vase material is"+celadonVase.material);
		System.out.println("The vase material is"+celadonVase.shape);
		System.out.println("The vase material is"+celadonVase.color);
		
		Vase celadonVase3=new Vase("ceramic "," bottle shape","palegreen");
			System.out.println("The vase material is"+celadonVase3.material);
			System.out.println("The vase material is"+celadonVase3.shape);
			System.out.println("The vase material is"+celadonVase3.color);
			
			
		Vase metalicVase=new Vase();
				metalicVase.material="brass";
				metalicVase.shape="round";
				metalicVase.color="blue";
				
		System.out.println("The vase material is"+metalicVase.material);
		System.out.println("The vase material is"+metalicVase.shape);
		System.out.println("The vase material is"+metalicVase.color);
		
		
		Vase metalicVase4=new Vase("brass","round","blue");
		System.out.println("The vase material is"+metalicVase4.material);
		System.out.println("The vase material is"+metalicVase4.shape);
		System.out.println("The vase material is"+metalicVase4.color);
		
		
		Vase mudVase=new Vase();
				mudVase.material="mud";
				mudVase.shape="cone";
				mudVase.color="brown";
				
		System.out.println("The vase material is"+mudVase.material);
		System.out.println("The vase material is"+mudVase.shape);
		System.out.println("The vase material is"+mudVase.color);
		
		
		Vase mudVase5=new Vase("mud","cone","brown");
			System.out.println("The vase material is"+mudVase5.material);
			System.out.println("The vase material is"+mudVase5.shape);
			System.out.println("The vase material is"+mudVase5.color);
			
			
		Vase bambooVase=new Vase();
				bambooVase.material="bamboo";
				bambooVase.shape="cylindrical";
				bambooVase.color="green";
				
		System.out.println("The vase material is"+bambooVase.material);
		System.out.println("The vase material is"+bambooVase.shape);
		System.out.println("The vase material is"+bambooVase.color);
		
		
		Vase bambooVase6=new Vase("bamboo","cylindrical","green");
				
		System.out.println("The vase material is"+bambooVase6.material);
		System.out.println("The vase material is"+bambooVase6.shape);
		System.out.println("The vase material is"+bambooVase6.color);
			
			
		Vase plasticVase=new Vase();
				plasticVase.material="plastic";
				plasticVase.shape="round";
				plasticVase.color="gray";
				
		System.out.println("The vase material is"+plasticVase.material);
		System.out.println("The vase material is"+plasticVase.shape);
		System.out.println("The vase material is"+plasticVase.color);
				
		Vase plasticVase7=new Vase("plastic","round","gray");
			System.out.println("The vase material is"+plasticVase7.material);
			System.out.println("The vase material is"+plasticVase7.shape);
			System.out.println("The vase material is"+plasticVase7.color);
				
}

}