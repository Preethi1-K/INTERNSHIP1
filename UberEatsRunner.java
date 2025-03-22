class UberEatsRunner{
public static void main(String arg[])
{
double amountOffood=UberEats.searchFordishes("Chapati");
System.out.println(amountOffood);
double costOffood=UberEats.searchFordishes("Chapati",3);
System.out.println(costOffood);
}
}