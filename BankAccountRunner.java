class BankAccountRunner{

public static void main(String arg[])
{
System.out.println("main started");
BankAccount.getBalance();
BankAccount.credit(300.00);
BankAccount.getBalance();
BankAccount.debit(750.00);
BankAccount.getBalance();
System.out.println("main ended");
}
}










