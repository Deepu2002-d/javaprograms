class Tv
{
 int cost;
 String brand;
 String color;
  Tv(int x,String y,String z)
	{
	 cost=x;
	 brand=y;
	 color=z;
	  return;
	}

	public static void main(String[] args)
	{
		Tv c1=new Tv(5000,"Samsung","color");
		System.out.println(c1.cost);
		System.out.println(c1.brand);
		System.out.println(c1.color);
	}
}