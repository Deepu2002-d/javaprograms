interface Classroom
{
 void Envi();
 
}
class Comic implements   Classroom
{
public void Envi()
 {
    System.out.println(" some comics");
 }
}
class Study  implements  Classroom
{
 public void  Envi()
 {
    System.out.println(" some study");
 }
}
 class pres  implements    Classroom
{
 public void  Envi()
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
class Inter4
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