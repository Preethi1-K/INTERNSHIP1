class Passport{
public static String register(String cpvLocation,String dcdrLocation,String givenName,String surName,String dob,String email,String emailloginSame,String loginId,String pwd,String confirmpwd,String hintQuestion,String hintAns,String captcha)//method signature
{
String userMessage=null;
boolean  validData = profileinfo( cpvLocation, dcdrLocation, givenName, surName, dob, email, emailloginSame, loginId, pwd, confirmpwd, hintQuestion,hintAns, captcha);
          if (valid==true)
             userMessage="successfull";
          else
             userMessage="unsuccessfull";
return validData;
}
public static boolean profileinfo(String cpvLocation,String dcdrLocation,String givenName,String surName,String dob,String email,String emailloginSame,String loginId,String pwd,String confirmpwd,String hintQuestion,String hintAns,String captcha)
{
       boolean validData=false;
			boolean iscpvLocation=false; 
			boolean isdcdrLocation=false; 
			boolean isgivenName=false; 
			boolean issurName=false; 
			boolean isdob=false; 
			boolean isemail=false; 
			boolean isemailloginSame=false; 
			boolean isloginId=false;
			boolean ispwd=false; 
			boolean isconfirmpwd=false; 
			boolean ishintQuestion=false;
			boolean ishintAns=false; 
			boolean iscaptcha=false;
if(cpvLocation!=null && !cpvLocation.isEmpty() && cpvLocation == "PO"||"CPVD".equals("CPVD"))
	//!"".isEmpty()
{
	iscpvLocation=true;
}
else
{
	System.out.println("invalid");
}
if(dcdrLocation!=null)
{
	isdcdrLocation=true;
}
else
{
	System.out.println("invalid");
	
}
if(givenName!=null && !givenName.isEmpty())
{
	isgivenName=true;
}
else
{
	System.out.println("provide name");
}
if(surName!=null)
{
	issurName=true;
}
else
{
	System.out.println("need surname");
	
}
if(dob!=null && !dob.isEmpty())
{
	isdob=true;
}
else{
	System.out.println("provide dob");
}
if(email!=null && !email.isEmpty())
{
	isemail=true;
}
else
{
	System.out.println("provide email");
}
if(emailloginSame!=null && !emailloginSame.isEmpty())
{
	isemailloginSame=true;
}
else
{
	System.out.println("email and emaillogin should be same");
}
if(loginId!=null && !loginId.isEmpty())
{
	isloginId=true;
}
else
{
	System.out.println("invalid");
}
if(pwd!=null && !pwd.isEmpty())
{
	ispwd=true;
}
else
{
	System.out.println("invalid");              
}
if(confirmpwd!=null && !confirmpwd.isEmpty())
{
	isconfirmpwd=true;
	
}
else
{
	System.out.println("pwd and confirmpwd should be same");
}
if(hintQuestion!=null && !hintQuestion.isEmpty())
{
	ishintQuestion=true;
}
else
{
	System.out.println("need it");
}
if(hintAns!=null && !hintAns.isEmpty())
{
	ishintAns=true;
}
else
{
	System.out.println("provide answer");
}
if(captcha!=null && !captcha.isEmpty())
{
	iscaptcha=true;
}
else
{
	System.out.println("enter captcha");
}
if(iscpvLocation == true &&  isdcdrLocation == true &&  isgivenName == true && issurName==true &&  isdob==true &&  isemail==true && isemailloginSame==true &&  isloginId==true && ispwd==true && isconfirmpwd==true &&  ishintQuestion==true && ishintAns==true &&  iscaptcha==true)
{
	validData=true;
}
return validData;
}
}


