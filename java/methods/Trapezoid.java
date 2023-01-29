class Trapezoid
{
static void trap()
{
	int a=10;
	int b=10;
	int h=5;
	double res= ((a*b)/2)*h;
	System.out.println(res);
	return;

}
	public static void main(String[] args)
	{
	   System.out.println("main starts");
	   trap();
	   System.out.println("main ends");
	}
}