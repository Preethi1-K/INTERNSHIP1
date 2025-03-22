class Amazon1Runner{
public static void main(String arg[]){
// copy of amazon class 
//new className---copy to get allocate memory-------
//className ref = new ClassName();
Amazon1 ref = new Amazon1();
	ref.id=1;
	ref.yourName="qwer";
	ref.phoneNo=2345612345L;
	ref.password="1253@qw";
	System.out.println("the account id is"+ref.id);
	System.out.println("the account Name is"+ref.yourName );
	System.out.println("the account phone no is"+ref.phoneNo);
  
  
  Amazon1 anotherRef = new Amazon1();
	anotherRef.id=1;
	anotherRef.yourName="abcd";
	anotherRef.phoneNo=2345612345L;
	anotherRef.password="1253@as";
	System.out.println("the account id is"+anotherRef.id);
	System.out.println("the account Name is"+anotherRef.yourName );
	System.out.println("the account phone no is"+anotherRef.phoneNo);
  
}
}