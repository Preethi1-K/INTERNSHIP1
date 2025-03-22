//porpose,function =method
class BankAccount{
//variable/datamember/field/property/reference
static double balance=200;
//behavoiur/functionallity/purpose
//parameter:datatype referenac
public static void credit(double amount){
System.out.println("credit started");
if(balance>0.0){
balance=balance+amount;
}else{
System.out.println("invalid amount");
}
System.out.println("credit ended");
}
public static void debit (double amount){
System.out.println("debit started");
if(amount<=balance){
balance=balance-amount;
}else{
System.out.println("insufficient balance");
}
System.out.println("debit ended");
}
public static void getBalance(){
System.out.println("balance is"+balance);
}
}