class Trap
{
static double trap()
{
	int a=10;
	int b=10;
	int h=5;
	double res= ((a*b)/2)*h;
	return res;

}
}
class Trapezoid
{

	public static void main(String[] args)
	{
	Trap s1=new Trap();
	   double x=s1.trap();
	   System.out.println(x);
	   
	}
}