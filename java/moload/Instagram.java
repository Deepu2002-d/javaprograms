class Insta
{
 void send(int pno)
 {
  System.out.println("sending phone no"+pno);
 }
 void send(int no, String txt)
 {
  System.out.println("sending  no and text"+no +txt);
 }
 void send(String txt)
 {
  System.out.println("sending upi"+txt);
 }
}
class Instagram
{
public static void main(String[] args)
{
   
   Insta p1=new Insta();
   p1.send(10);
   p1.send(123,"hi");
   p1.send("abcfdght");

}

}