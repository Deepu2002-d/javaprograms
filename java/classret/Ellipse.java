class Elli
{
static double eli()
{
	double pi=3.142;
	int a=20;
	int b=35;
	double res=pi*a*b;
	
	return res;

}
}
class Ellipse
{

	public static void main(String[] args)
	{
	   Elli s1=new Elli();
	   double x=s1.eli();
	   System.out.println(x);
	   
	}
}