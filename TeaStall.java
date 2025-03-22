class TeaStall{
static String name="Abc";
public static void main(String a[])
        {
		System.out.println("the stall name is"+name);
		name="Xyz";
		updateName();
		System.out.println("name after re-int");
		System.out.println("the stall name is"+name);
		}
public static void updateName()
        {
	      name="Xyz";
		  System.out.println("the update name is"+name);
        }
 
	
}

