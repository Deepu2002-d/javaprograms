class sample
{
static void cir(int r)
{
	
	double pi=3.142;
	double res=pi*r*r;
	System.out.println(res);
}
}
class Circle
{
public static void main(String[] args)
{
	sample.cir(6);
}
}