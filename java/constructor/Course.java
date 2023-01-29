class Course
{

 String c_name;
 String u_name; 
 int c_cost;

  Course(String x,String y,int z)
	{
	c_name=x;
	u_name=y;
	c_cost=z;
	  return;
	}

	public static void main(String[] args)
	{
		Course c1=new Course("bsc","sk university",50000);
		System.out.println(c1.c_name);
		System.out.println(c1.u_name);
		System.out.println(c1.c_cost);
	}
}