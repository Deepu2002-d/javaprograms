class sample
{
static double elli()
{
	int a=5;
	int b=7;
	double pi=3.142;
	double res=pi*a*b;
	return res;
}
}
class Ellipse
{
public static void main(String[] args)
{
	double x=sample.elli();
	System.out.println(x);
}
}