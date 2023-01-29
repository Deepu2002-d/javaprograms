class Trap
{
void area(int a,int b,int h)
{
	
	double res=0.5*(a+b)*h;
	System.out.println(res);

}
}
class Trapezoid
{

public static void main(String[] args)
{
	Trap s1=new Trap();
	s1.area(2,3,4);
}
}