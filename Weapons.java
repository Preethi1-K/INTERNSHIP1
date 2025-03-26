class Weapons {
    String name;
    String type;
    String damage;
    double weight;
    String material;
    boolean isLethal;
	Weapons()
		{
			this("AK-47","ASSault Rifle","High",3.47,"Steal and wood",true);
			System.out.println("the non arg constracter is invoked");
  
		}
	Weapons(String name)
		{
			this(name,"ASSault Rifle","High",3.47,"Steal and wood",true);
			System.out.println("the constracter with  name is invoked");
		}
	Weapons(String name,String type)
		{
			this(name,type,"High",3.47,"Steal and wood",true);
			System.out.println("the constracter with typeis invoked");
 
		}
	Weapons(String name,String type,String damage)
		{
			this(name,type,damage,3.47,"Steal and wood",true);
			System.out.println("the constracter with  damageis invoked");
		}
	Weapons(String name,String type,String damage,double weight)
		{
	 
			this(name,type,damage,weight,"Steal and wood",true);
			System.out.println("the constracter with weight is invoked");
		}
 	Weapons(String name,String type,String damage,double weight,String material)
		{
			this( name, type, damage, weight,material,true);
			System.out.println("the constracter with material is invoked");
		}
	Weapons(String name,String type,String damage,double weight,String material,boolean isLethal)
			{ 
			        this.name=name;
					this.type=type;
					this.damage=damage;
					this.weight=weight;
					this.material=material;
					this.isLethal=isLethal;
					System.out.println("all the constracter is invoked");
			}
 public void detailsOfWeapon()
	{
		System.out.println("The  name weapon  is"+name);
		System.out.println("The type  of  weapon is"+type);
		System.out.println("damage  of the weapon is"+damage);
		System.out.println("weight  of the weapon is"+weight);
		System.out.println("materiall of  the weaponis "+material);
		System.out.println(" lathal of weapon"+isLethal);

	
	}

}