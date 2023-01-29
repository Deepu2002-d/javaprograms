class sample
{
static int rec()
{
	int w=5;
	int h=10;
	int res=w*h;
	return res;
}
}
class Rectangle
{
public static void main(String[] args)
{
	int x=sample.rec();
	System.out.println(x);
}
}