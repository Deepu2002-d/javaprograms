class Bike
{
 int cost;
 String brand;
 String color;
  Bike(int cost,String brand,String color)
	{
	 this.cost=cost;
	 this.brand=brand;
	 this.color=color;
	  return;
	}
	public String toString()
	{
		return "Bike cost"+this.cost+"Bike brand"+this.brand+"bike color"+this.color+;
	}

	public static void main(String[] args)
	{
		Bike c1=new Bike(5000,"yamaha","pink");
		System.out.println(c1.cost);
		System.out.println(c1.brand);
		System.out.println(c1.color);
	}
}