class Home
{

 String h_name;
 int h_cost;
 String h_col;

  Home(String x,int y,String z)
	{
	h_name=x;
	h_cost=y;
	h_col=z;
	  return;
	}

	public static void main(String[] args)
	{
		Home h1=new Home("narayana",450000,"black");
		System.out.println(h1.h_name);
		System.out.println(h1.h_cost);
		System.out.println(h1.h_col);
	}
}