class sample
{
static void rec(int w,int h)
{
	
	int res=w*h;
	System.out.println(res);
}
}
class Rectangle
{
public static void main(String[] args)
{
	sample.rec(5,10);
}
}