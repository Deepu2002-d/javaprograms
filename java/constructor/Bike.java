class Bike
{
 int cost;
 String brand;
 String color;
  Bike(int x,String y,String z)
	{
	 cost=x;
	 brand=y;
	 color=z;
	  return;
	}

	public static void main(String[] args)
	{
		Bike c1=new Bike(5000,"yamaha","pink");
		System.out.println(c1.cost);
		System.out.println(c1.brand);
		System.out.println(c1.color);
	}
}