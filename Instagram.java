class Instagram
{
public static String logIn(String phoneNumber,String userName)
{
String givenData=null;
boolean checkingData=verifyProfile(phoneNumber,userName);
if(checkingData==true)
	givenData="logIn is Successfull";
else
	givenData="logIn is Unsuccessfull check again";
return givenData;
}
public static boolean verifyProfile(String phoneNumber,String userName)
{
	boolean checkingData=false;
	boolean isphoneNumber=false;
	boolean isuserName=false;
	
if(phoneNumber!=null && !phoneNumber.isEmpty() && phoneNumber.length()==10)
	{
		isphoneNumber=true;
	}
else
		System.out.println("Please enter valid phone number");
if(userName!=null && !userName.isEmpty() && userName.length()>=3)
	{
		isuserName=true;
	}
else
		System.out.println("please enter user name");
	
	if(isphoneNumber==true && isuserName==true )
	{
		checkingData=true;
	}
return checkingData;
}



public static String logIn(String email)
{
String givenData=null;
 String checkingData=verifyProfile(email);
if(checkingData==true)
	givenData="logIn is Successfull";
else
	givenData="logIn is Unsuccessfull check again";
return givenData;
}

public static void  verifyProfile(String email)
{
boolean chekingData=false;
boolean isemail=false;

if(email!=null && !email.isEmpty() )
	{
		isemail=true;
	}
else
		System.out.println("Please enter valid phone number");
	return ;

}
}




