class sample
{
static int para()
{
	int h=10;
	int b=5;
	int res=h*b;
	return res;
}
}
class Parallelogram
{
public static void main(String[] args)
{
	int x=sample.para();
	System.out.println(x);
}
}