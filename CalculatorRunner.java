class CalculatorRunner{
	
public static int add(int number,int nextNumber)
{
	int total= number + nextNumber;
	System.out.println("The Addition"+number+"and"+nextNumber+"is:"+total);
	return total;
}
public static int subtract(int number,int nextNumber)
{
	int total= number - nextNumber;
     System.out.println("The Subtraction "+number+"and"+nextNumber+"is:"+total);
	 return total;
}	 
public static int multiplication(int number,int nextNumber)
{

	int total= number * nextNumber;
	System.out.println("The Multiplication"+number+"and"+nextNumber+"is:"+total);
	return total;
}
public static int division(int number,int nextNumber)
{
      if (nextNumber!=0)
	  {
	     
		  return number / nextNumber;
	  }
	  else
	  {
		  System.out.println("error");
		  
		  return 0;
	  }
	  
	
}
public static void  modulus(int number, int nextNumber )
{
	int total= number % nextNumber;
		System.out.println("The Modulus"+number+"and"+nextNumber+"is:"+total);
}
}


 