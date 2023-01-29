class Tester
{
int x=10;
void disp()
{
 System.out.println("hello");
}
}
class Huliyacha extends Tester
{
  void ho()
  {
   System.out.println("welcome");
  }
}
class Typ7
{
public static  void main()
{
Tester t=new Huliyacha();
t.dips();
System.out.println(t.x);
Huliyacha h=(Huliyacha)t;
h.ho();
}
}