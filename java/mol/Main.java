class Movie_v1
{
  void display()
  {
   System.out.println("black color tv");
  }

}
class Movie_v2 extends Movie_v1
{
  void display()
  {
   System.out.println(" color tv");
  }

}
class Main
{
  public static void main(String[] args)
  {
   Movie_v2 M=new Movie_v2();
   M.display();
  }
}