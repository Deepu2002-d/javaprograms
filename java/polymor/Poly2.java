class Bottle
{
 void store()
 {
    System.out.println(" store something");
 }
}
class Water extends Bottle
{
 void store()
 {
    System.out.println(" water bottle");
 }
}
class Milk extends Bottle
{
 void store()
 {
    System.out.println(" mikl bottle");
 }
}
 class Juice extends  Bottle
{
 void store()
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