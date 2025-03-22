class Alphabets{
static String  charecters[]={"A","B","C","D","E","F","G","H","I","J"};
public static void main(String arg[])
{
System.out.println("main started");
getCharecters();//our own methid invokation
System.out.println("main ended");
}
public static void getCharecters()//get,fetch,read
{
System.out.println("inside Charecters()");
for(String charecter:charecters){
	System.out.println(charecter);
}
System.out.println("end of charecters()");
}
}

//System.out.println(charecters[0]+ " "+charecters[1]+ " "+charecters[2]+ " "+charecters[3]+ " "+charecters[4]+ " "+charecters[5]+ " "+charecters[6]+ " "+charecters[7]+ " "+charecters[8]+ " "+charecters[9]);
//System.out.println("the number of item:"+charecters.length);

