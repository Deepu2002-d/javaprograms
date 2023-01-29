class Lib
{
 static void bb(int date)
 {
  System.out.println("borrow book date"+date);
 }
 static void bb(int fine, String book)
 {
  System.out.println("sending  no and text"+fine +book);
 }
 static void bb(String name)
 {
  System.out.println("book name"+name);
 }
}
class Library
{
public static void main(String[] args)
{
   
  Lib.bb(56);
  Lib.bb(344,"java book");
  Lib.bb("hello");

}

}