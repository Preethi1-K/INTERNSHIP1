class TelegramRunner
{
public static void main(String arg[])
{
  String resultOflogin = Telegram.logIn("ramya@123","mg@123");
  System.out.println(resultOflogin);
  String teligramLogin= Telegram.logIn(9128884569L,"sql@123");
  System.out.println(teligramLogin);
}
}