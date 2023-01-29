class Classroom
{
 void Envi()
 {
    System.out.println(" store something");
 }
}
class Comic extends   Classroom
{
 void Envi()
 {
    System.out.println(" some comics");
 }
}
class Study extends  Classroom
{
 void  Envi()
 {
    System.out.println(" some study");
 }
}
 class pres extends    Classroom
{
 void  Envi()
 {
    System.out.println(" some presentation");
 }
}
class User
{
 static void behaviour(  Classroom c1)
 {
   c1.Envi();
 }
}
class Poly4
{
public static void main(String[] args)
{
	Comic c1=new Comic();
	Study s1=new Study();
	 pres p1=new  pres();
		User.behaviour(c1);
	    User.behaviour(s1);
		User.behaviour(p1);
}
}