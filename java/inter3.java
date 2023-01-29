class Mobile
{
 void operation()
 {
    System.out.println(" store something");
 }
}
class Vedio extends  Mobile
{
 void  operation()
 {
    System.out.println(" some vedios");
 }
}
class Audio extends  Mobile
{
 void  operation()
 {
    System.out.println(" some adios");
 }
}
 class Gaming extends   Mobile
{
 void  operation()
 {
    System.out.println(" some games");
 }
}
class Users
{
 static void usage(  Mobile m1)
 {
   m1.operation();
 }
}
class Poly3
{
public static void main(String[] args)
{
	Vedio v1=new Vedio();
	Audio a1=new Audio();
	Gaming g1=new Gaming();
	Users.usage(v1);
	Users.usage(a1);
	Users.usage(g1);

	
}
}