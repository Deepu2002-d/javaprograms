class Emp1
{
 int e_id;
 int e_sal;
 char e_grade;
  Emp1(int e_id,int e_sal,char  e_grade)
	{
	 this.e_id=e_id;
	  this.e_sal=e_sal;
	  this.e_grade= e_grade;
	  return;
	}

public String toString()
	{
		return "emp id"+this.e_id+"emp sal"+this.e_sal+"emp grade"+this.e_grade+;
	}
	public static void main(String[] args)
	{
		Emp1 e1=new Emp1(1,50000,'a');
		System.out.println(e1.e_id);
		System.out.println(e1.e_sal);
		System.out.println(e1.e_grade);
	}
}