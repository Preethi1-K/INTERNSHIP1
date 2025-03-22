class Patient{
static int patientId=19;
static String patientName="exy";
static char gender='M';
public static void main(String arg[])
{
System.out.println("the patient id is"+patientId);
System.out.println("the patient name is"+patientName);
	//patientId=20;
     //patientName="exy";
     //gender='M';
patientIdupdate();
System.out.println("the patient id is"+patientId);
System.out.println("the patient name is"+patientName);
}
public static void patientIdupdate()
{
	 patientId=20;
     patientName="exy";
     gender='M';
}

}//int=0,float=0.0,short,lonng=0,double0.0,char=space,string =null,boolean=false by default
//local variable need initialization
//static variable does not 
//more then one references