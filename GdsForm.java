class GdsForm{
//Registration mobile number,email,enter mobile number}
public static String register(String mobileNo,String email,String password,String firstName,String lastName,String gender)
{
	String statusOfData=null;
	boolean valid=profile(mobileNo,email,password,firstName,lastName,gender);
	if (valid==true)
		statusOfData = "successfull";
    else
		statusOfData = "unsucessfull";
return  statusOfData ;
	
}
public static boolean profile(String mobileNo,String email,String password,String firstName,String lastName,String gender)
{
	boolean valid=false;
	boolean ismobileNo=false;
	boolean isemail=false;
	boolean ispassword=false;
	boolean isfirstName=false;
	boolean islastName=false;
	boolean isgender=false;
	if(mobileNo!=null &&!mobileNo.isEmpty()&& mobileNo.length()==10)
	{
		ismobileNo=true;
	}
	else
	{
		System.out.println("invalid");
	}
	if(email!=null && !email.isEmpty() )
	{
		isemail=true;
	}
	else
	{
		System.out.println("invalid");
	}
	if(password!=null && !password.isEmpty() && password.length()==4)
	{
		ispassword=true;
	}
	else
	{
		System.out.println("provide valid password");
	}
	if(firstName!=null && !firstName.isEmpty()&& firstName.length()>=3)
	{
		isfirstName=true;
	}
	else{
		System.out.println("provide valid name");
	}
	if(lastName!=null && !lastName.isEmpty())
	{
		islastName=true;
	}
	else
	{
		System.out.println("invalid");
	}
	if(gender!=null && !gender.isEmpty())
	{
		isgender=true;
	}
	else{
		System.out.println("it is mandatory");
	}
	if(ismobileNo==true && isemail==true && ispassword==true && isfirstName==true && islastName==true && isgender==true)
	{
		valid=true;
	}
	return valid;
}
}