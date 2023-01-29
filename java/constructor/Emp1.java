class Emp1
{
 int e_id;
 int e_sal;
 char e_grade;
  Emp1(int x,int y,char z)
	{
	  e_id=x;
	  e_sal=y;
	  e_grade=z;
	  return;
	}

	public static void main(String[] args)
	{
		Emp1 e1=new Emp1(1,50000,'a');
		System.out.println(e1.e_id);
		System.out.println(e1.e_sal);
		System.out.println(e1.e_grade);
	}
}