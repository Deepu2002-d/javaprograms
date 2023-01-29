class Laptop
{

 String l_name;
 String l_brand; 
 int l_cost;

  Laptop(String l_name,String l_brand,int l_cost)
	{
	this.l_name=l_name;
	this.l_brand=l_brand;
	this.l_cost=l_cost;
	  return;
	}

	public static void main(String[] args)
	{
		Laptop l1=new Laptop("victus","hp",50000);
		System.out.println(l1.l_name);
		System.out.println(l1.l_brand);
		System.out.println(l1.l_cost);
	}
}