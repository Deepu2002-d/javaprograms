interface Bottle
{
 void store();
 
}
class Water implements Bottle
{
public void store()
 {
    System.out.println(" water bottle");
 }
}
class Milk implements Bottle
{
public void store()
 {
    System.out.println(" mikl bottle");
 }
}
 class Juice implements  Bottle
{
 public void store()
 {
    System.out.println(" juice bottle");
 }
}
class Storing
{
 static void use( Bottle b1)
 {
   b1.store();
 }
}
class Poly2
{
public static void main(String[] args)
{
	Water w1=new Water();
	Milk m1=new Milk();
	Juice j1=new Juice();
	Storing.use(w1);
	Storing.use(m1);
	Storing.use(j1);
}
}