class MaxFashion{
public static String signUp(String firstName , String lastName,String phoneNo,String dob ,String emailId,String gender)
{
String reference = null;
boolean userValid = validProfile(firstName,lastName,phoneNo, dob,emailId,gender);
if (userValid==true)
	reference="user signup successfull";
else
	reference="user signup unsuccessfull";
return reference;

}
public static boolean validProfile(String firstName,String lastName,String phoneNo,String dob,String emailId,String gender)
{
boolean userValid=false;
        boolean isfirstName=false;
		boolean islastName=false;
		boolean isphoneNo=false;
		boolean isdob=false;
		boolean isemailId=false;
		boolean isgender=false;
if(firstName!=null && !firstName.isEmpty()&& firstName.length()>=3)
{
   isfirstName = true;
}
else
{
	System.out.println("firstname is invalid provide validname");
}
if(lastName!=null &&!lastName.isEmpty() && lastName.length()>=1)
{
  islastName = true;
}
else
{
	System.out.println("last name is invalid provide valid");
}
if(phoneNo!=null &&!phoneNo.isEmpty()&& phoneNo.length()>0 && phoneNo.length()==10)
{
             isphoneNo = true;
}
else
{
	System.out.println("phone number is invalid provide proper phone no");
}
if(dob!= null && !dob.isEmpty())
{
      isdob = true;
}
else
{
	System.out.println("provide in valid dob");
}
if(emailId!=null && !emailId.isEmpty())
{
isemailId = true;
}
else
{
	System.out.println("provide proper email id");
}
if(gender!=null && !gender.isEmpty())
{
          isgender = true;
}
else
{
 System.out.println("provide proper way");	
}
if(isfirstName==true && islastName==true && isphoneNo==true && isdob==true && isemailId==true && isgender==true)
{
	userValid=true;
}
return userValid;
}
}