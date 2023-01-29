class Cloth
{
  String c_color;
  int c_cost;
  char c_size;
  Cloth(String c_color ,int c_cost,char c_size)
	{
	 this.c_color=c_color;
	  this.c_cost=c_cost;
	  this.c_size=c_size;
	  return;
	}
	public String toString()
	{
		return "Cloth cost"+this.c_cost+"Cloth color"+this.c_color+"cloth size"+this.c_size+;
	}

	public static void main(String[] args)
	{
		Cloth c1=new Cloth("pink",300,'l');
		System.out.println(c1.c_color);
		System.out.println(c1.c_cost);
		System.out.println(c1.c_size);
	}
}