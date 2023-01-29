class Teashop
{
 void tea(int cost)
 {
  System.out.println("tea cost"+cost);
 }
 void tea(int cost, String type)
 {
  System.out.println("sending  no and text"+cost +type);
 }
 void tea(String type)
 {
  System.out.println("sending upi"+type);
 }
}
class Chai
{
public static void main(String[] args)
{
   
   Teashop p1=new Teashop();
   p1.tea(10);
   p1.tea(123,"hi");
   p1.tea("abcfdght");

}

}