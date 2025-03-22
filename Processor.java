class Processor{
static int  id=301; 
static String name="Intel i7"; 
static int gen=11; 
static int clockSpeed=3;
public static void main(String arg[])
{
	System.out.println("the processor id is"+id);
	System.out.println("the processor name is"+name);
	System.out.println("the processor generation is"+gen);
	System.out.println("the processor clock speed is"+clockSpeed);
	//id=300; 
	//name="AMD"; 
	//gen=10; 
	//clockSpeed=2;
	update();
	System.out.println("the processor id is"+id);
	System.out.println("the processor name is"+name);
	System.out.println("the processor generation is"+gen);
	System.out.println("the processor clock speed is"+clockSpeed);
}
public static void update()
{
	id=300; 
	name="AMD"; 
	gen=10; 
	clockSpeed=2;
}
}