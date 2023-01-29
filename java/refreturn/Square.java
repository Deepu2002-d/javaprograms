class Square
{
static int rec()
{
	int a=2;
	int res=a*a;

	return res;

}
	public static void main(String[] args)
	{
	   Square s1=new Square();
	   int x=rec();
	   System.out.println(x);
	}
}