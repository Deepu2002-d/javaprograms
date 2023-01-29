class School
{
  String sc_name;
  char sc_grade;
  int sc_str;
  School(String sc_name,char sc_grade,int sc_str)
	{
	 this.sc_name=sc_name;
	 this.sc_grade=sc_grade;
	 this.sc_str=sc_str;
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