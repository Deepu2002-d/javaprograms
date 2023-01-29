class Phonepay
{
 void sendm(int pno)
 {
  System.out.println("sending phone no"+pno);
 }
 void sendm(int acno, String ifsc)
 {
  System.out.println("sending  no and text"+acno +ifsc);
 }
 void sendm(String upi)
 {
  System.out.println("sending upi"+upi);
 }
}
class Phone
{
public static void main(String[] args)
{
   
   Phonepay p1=new Phonepay();
   p1.sendm(10);
   p1.sendm(123,"sbi");
   p1.sendm("abc");

}

}