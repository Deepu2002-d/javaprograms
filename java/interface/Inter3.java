interface Mobile
{
 void operation();
 
}
class Vedio implements  Mobile
{
public void  operation()
 {
    System.out.println(" some vedios");
 }
}
class Audio implements Mobile
{
 public void  operation()
 {
    System.out.println(" some adios");
 }
}
 class Gaming implements   Mobile
{
 public void  operation()
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
class Inter3
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