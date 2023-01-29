class sample
{
static int squ()
{
	int a=10;
	int res=a*a;
	return res;
}
}
class Square
{
public static void main(String[] args)
{
	int x=sample.squ();
	System.out.println(x);
}
}