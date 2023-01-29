class sample
{
static double sec()
{
	int r=10;
	double t=3.56;
	double res=0.5*r*r*t;
	return res;
}
}
class Sector
{
public static void main(String[] args)
{
	double x=sample.sec();
	System.out.println(x);
}
}