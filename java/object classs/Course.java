class Course
{

 String c_name;
 String u_name; 
 int c_cost;

  Course(String c_name,String u_name,int c_cost)
	{
	this.c_name=c_name;
	this.u_name=u_name;
	this.c_cost=c_cost;
	  return;
	}
	public String toString()
	{
		return "Course cost"+this.c_cost+"university name"+this.u_name+"course name"+this.c_name+;
	}

	public static void main(String[] args)
	{
		Course c1=new Course("bsc","sk university",50000);
		System.out.println(c1.c_name);
		System.out.println(c1.u_name);
		System.out.println(c1.c_cost);
	}
}