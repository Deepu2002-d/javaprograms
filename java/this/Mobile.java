class Mobile
{
  int mob_cost;
  String mob_mod;
  String mob_col;
  Mobile(int mob_cost,String mob_mod,String mob_col)
	{
	 this.mob_cost=mob_cost;
	  this.mob_mod=mob_mod;
	  this.mob_col=mob_col;
	  return;
	}
	public String toString()
	{
		return "moblile cost"+this.m_cost+""+this.h_name+"home color"+this.h_color+;
	}

	public static void main(String[] args)
	{
		Mobile m1=new Mobile(20000,"realme","pink");
		System.out.println(m1.mob_cost);
		System.out.println(m1.mob_mod);
		System.out.println(m1.mob_col);
	}
}