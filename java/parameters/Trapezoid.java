class Trapezoid
{
static void trap(int a,int b)
{
	
	double res= a*b*0.5;
	System.out.println(res);
	return;

}
	public static void main(String[] args)
	{
	   System.out.println("main starts");
	   trap(4,7);
	   System.out.println("main ends");
	}
}