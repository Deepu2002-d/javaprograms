class School
{
  String sc_name;
  char sc_grade;
  int sc_str;
  School(String x,char y,int z)
	{
	 sc_name=x;
	 sc_grade=y;
	 sc_str=z;
	  return;
	}

	public static void main(String[] args)
	{
		School c1=new School("narayana",'a',5000);
		System.out.println(c1.sc_name);
		System.out.println(c1.sc_grade);
		System.out.println(c1.sc_str);
	}
}