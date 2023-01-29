class Mobile
{
  int mob_cost;
  String mob_mod;
  String mob_col;
  Mobile(int x,String y,String z)
	{
	  mob_cost=x;
	  mob_mod=y;
	  mob_col=z;
	  return;
	}

	public static void main(String[] args)
	{
		Mobile m1=new Mobile(20000,"realme","pink");
		System.out.println(m1.mob_cost);
		System.out.println(m1.mob_mod);
		System.out.println(m1.mob_col);
	}
}