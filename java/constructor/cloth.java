class Cloth
{
  String c_color;
  int c_cost;
  char c_size;
  Cloth(String x,int y,char z)
	{
	  c_color=x;
	  c_cost=y;
	  c_size=z;
	  return;
	}

	public static void main(String[] args)
	{
		Cloth c1=new Cloth("pink",300,'l');
		System.out.println(c1.c_color);
		System.out.println(c1.c_cost);
		System.out.println(c1.c_size);
	}
}