class Trap
{
void area()
{
	int  a=3;
	int b=10;
	int h=20;
	double res=0.5*(a+b)*h;
	System.out.println(res);

}
}
class Trapezoid
{
public static void main(String[] args)
{
	Trap s1=new Trap();
	s1.area();
}
}