class sample
{
static double tri()
{
	int b=5;
	int h=6;
	double res=0.5*b*h;
	return res;

}
}
class Triangle
{
public static void main(String[] args)
{
	 double x=sample.tri();	
	 System.out.println(x);
}
}