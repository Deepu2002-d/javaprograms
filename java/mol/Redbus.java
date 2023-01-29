class Redbus_v1
{
  void book()
  {
   System.out.println("Cancle the ticket time unlimit");
  }

}
class Redbus_v2 extends Redbus_v1
{
  void book()
  {
   System.out.println(" Cancle the ticket within the limit");
  }

}
class Redbus
{
  public static void main(String[] args)
  {
   Redbus_v2 s=new Redbus_v2();
   s.book();
  }
}