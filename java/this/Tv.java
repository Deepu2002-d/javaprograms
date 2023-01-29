class Tv
{
 int cost;
 String brand;
 String color;
  Tv(int cost,String brand,String color)
	{
	 this.cost=cost;
	 this.brand=brand;
	 this.color=color;
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