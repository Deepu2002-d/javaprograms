class Circle
{
static double cir()
{
	double pi=3.142;
	int r=20;
	double res=pi*r*r;

	return res;

}
	public static void main(String[] args)
	{
	  Circle s1=new Circle(); 
	   double x=s1.cir();
	   System.out.println(x);
	}
}