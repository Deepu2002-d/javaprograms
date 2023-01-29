class Human
{
 void emotions()
 {
    System.out.println(" Some emotions");
 }
}
class Angry extends Human
{
 void emotions()
 {
    System.out.println(" Angry");
 }
}
class Happy extends Human
{
 void emotions()
 {
    System.out.println(" Happy Happy");
 }
}
 class Sad extends Human
{
 void emotions()
 {
    System.out.println(" sad sad");
 }
}
class Situation
{
 static void react(Human h1)
 {
   h1.emotions();
 }
}
class Poly1
{
public static void main(String[] args)
{
	Angry a1=new Angry();
	Happy b1=new Happy();
	Sad s1=new Sad();
	Situation.react(a1);
	Situation.react(b1);
	Situation.react(s1);
}
}