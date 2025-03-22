class Zepto{
public static String logIn(String phoneNo,String sentOtp,String fullName,String wattsappNo,String location,String items)
{
String result=null;
boolean valid=profile(phoneNo,sentOtp,fullName,wattsappNo,location,items);
if(valid==true)
result="successfull";
else
result="unsuccessfull";
return result;
}
public static boolean profile(String phoneNo,String sentOtp,String fullName,String wattsappNo,String location,String items)
{
boolean valid=false;
boolean isphoneNo=false;
boolean issentOtp=false;
boolean isfullName=false;
boolean iswattsappNo=false;
boolean islocation=false;
boolean isitems=false;
if(phoneNo!=null && !phoneNo.isEmpty()&& phoneNo.length()==10)
{
    isphoneNo=true;
}
else
{
System.out.println("invalid");
}
if(sentOtp!=null && !sentOtp.isEmpty())
{
     issentOtp=true;
}else
{
	System.out.println("invalid");
}
if(fullName!=null && !fullName.isEmpty())
{
	isfullName=true;
}
else
{
System.out.println("invalid");
}
if(fullName!=null && !fullName.isEmpty())
{
	isfullName=true;
}
else
{
	System.out.println("please give name");
	
}
if(wattsappNo!=null && !wattsappNo.isEmpty() && wattsappNo.length()==10)
{
	iswattsappNo=true;
}
else{
	System.out.println("give wattsappNo");
}
if(location!=null && !location.isEmpty())
{
	islocation=true;
}
else
{
	System.out.println("provide address");
}
if(items!=null && !items.isEmpty() && items.length()>=1)
{
	isitems=true;
}
else{
	System.out.println("invalid");
}
if(isphoneNo==true && issentOtp==true && isfullName==true && iswattsappNo==true && islocation==true && isitems==true )
{
	valid=true;
}
return valid;
}
}