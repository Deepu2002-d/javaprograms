class Facebook_v1
{
  void account()
  {
   System.out.println("jion with concact number");
  }

}
class Facebook_v2 extends Facebook_v1
{
  void account()
  {
   System.out.println(" jion with link");
   super.account();
  }

}
class Facebook


{
  public static void main(String[] args)
  {
   Facebook_v2 s=new Facebook_v2();
   s.account();
  }
}