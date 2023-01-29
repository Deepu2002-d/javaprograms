class sample
{
static void trap(int a,int b,int h)
{
	double res=0.5*(a+b)*h;
	System.out.println(res);
}
}
class Trapezoid
{
public static void main(String[] args)
{
	sample.trap(2,6,7);
}
}