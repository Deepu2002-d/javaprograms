class sample
{
static void sec(int r,double t)
{
	
	double res=0.5*r*r*t;
	System.out.println(res);
}
}
class Sector
{
public static void main(String[] args)
{
	sample.sec(5,5.65);
}
}