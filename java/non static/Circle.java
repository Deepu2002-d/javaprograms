class  Circle
{
	void area()
	{
	 int r=5;
	 double pi=3.142;
	 double res=pi*r*r;
	 System.out.println(res);
	}
	public static void main(String[] args)
	{
	 new Circle().area();
	}
}