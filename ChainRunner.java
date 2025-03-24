class ChainRunner
{
	public static void main(String arg[])
	{
	  Chain link=new Chain();
	        link.name="curb chain";
			link.material="Gold";
			link.price=150000;
      System.out.println("The chain name is"+link.name);
	  System.out.println("The chain name is"+link.material);
	  System.out.println("The chain name is"+link.price);
	  
	  Chain link1=new Chain("curb chain","Gold",15000);
				System.out.println("The chain name is"+link1.name);
				System.out.println("The chain name is"+link1.material);
				System.out.println("The chain name is"+link1.price);
				
				
	 Chain cord=new Chain();
	        cord.name="Rope chain";
			cord.material="silver";
			cord.price=16000;
      System.out.println("The chain name is"+cord.name);
	  System.out.println("The chain name is"+cord.material);
	  System.out.println("The chain name is"+cord.price);
	 
	 Chain cord2=new Chain("Rope chain","silver",16000);
	    System.out.println("The chain name is"+cord2.name);
	    System.out.println("The chain name is"+cord2.material);
	    System.out.println("The chain name is"+cord2.price);
		System.out.println("");
		
		
	 Chain string=new Chain();
	        string.name="Figaro chain";
			string.material="Gold";
			string.price=170000;
      System.out.println("The chain name is"+string.name);
	  System.out.println("The chain name is"+string.material);
	  System.out.println("The chain name is"+string.price);
	  System.out.println("");
	  
	  
	   Chain string3=new Chain("Figaro chain","Gold",170000);
				System.out.println("The chain name is"+string3.name);
				System.out.println("The chain name is"+string3.material);
				System.out.println("The chain name is"+string3.price);
				System.out.println("");
	 
	 
	 Chain sequence=new Chain();
			sequence.name="box chain";
			sequence.material="Platinum";
			sequence.price=200000;
	System.out.println("The chain name is"+sequence.name);
	System.out.println("The chain name is"+sequence.material);
	System.out.println("The chain name is"+sequence.price);
	System.out.println("");
	
	Chain sequence4=new Chain("box chain","Platinum",200000);
				System.out.println("The chain name is"+sequence4.name);
				System.out.println("The chain name is"+sequence4.material);
				System.out.println("The chain name is"+sequence4.price);
				System.out.println("");
				
	
	Chain bond = new Chain();
			bond.name="snake chain";
			bond.material="silver";
			bond.price=150000;
	    System.out.println("The chain name is"+bond.name);
		System.out.println("The chain name is"+bond.material);
		System.out.println("The chain name is"+bond.price);
		System.out.println("");
		
	Chain bond5 = new Chain("snake chain","silver",15000);
		System.out.println("The chain name is"+bond5.name);
		System.out.println("The chain name is"+bond5.material);
		System.out.println("The chain name is"+bond5.price);
		System.out.println("");
		
		
	Chain strand = new Chain();
			strand.name="Anchor chain";
			strand.material="gold";
			strand.price=160000;
	    System.out.println("The chain name is"+strand.name);
		System.out.println("The chain name is"+strand.material);
		System.out.println("The chain name is"+strand.price);
		System.out.println("");
		
		
	Chain strand6 = new Chain("Anchor chain","gold",160000);
			System.out.println("The chain name is"+strand6.name);
			System.out.println("The chain name is"+strand6.material);
			System.out.println("The chain name is"+strand6.price);
			System.out.println("");
			
			
	Chain shackle = new Chain();
			shackle.name=" ballchain";
			shackle.material="silver";
			shackle.price=130000;
	    System.out.println("The chain name is"+shackle.name);
		System.out.println("The chain name is"+shackle.material);
		System.out.println("The chain name is"+shackle.price);
		System.out.println("");
	
	Chain shackle7 = new Chain("ballchain","silver",130000);
			System.out.println("The chain name is"+shackle7.name);
			System.out.println("The chain name is"+shackle7.material);
			System.out.println("The chain name is"+shackle7.price);
			System.out.println("");
	 
	 }
}