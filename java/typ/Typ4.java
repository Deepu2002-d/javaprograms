class Demo
{
double z=32.3;
}
class Dumtaka extends Demo
{
	int x=18;
}
class Typ4
{
	public static void main(String[] args)
	{
		Demo d=new Dumtaka();
		  System.out.println(d.z);
		  Dumtaka d1=(Dumtaka)d;
		  System.out.println(d1.x);
	}
}