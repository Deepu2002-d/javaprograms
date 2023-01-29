class Mail
{
 static void send(int no)
 {
  System.out.println("send no"+no);
 }
 static void send(int no, String mgs)
 {
  System.out.println("sending  no and mgs"+no +mgs);
 }
 static void send(String mgs)
 {
  System.out.println("send mgs"+mgs);
 }
}
class Email
{
public static void main(String[] args)
{
   
  Mail.send(56);
  Mail.send(344,"java book");
  Mail.send("hello");

}

}