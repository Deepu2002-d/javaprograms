class Cool
{
void add()
{
  System.out.println("hello");
}
}
class Goolata extends Cool
{
	void disp()
	{
		 System.out.println("java");
	}
}
class Typ33
{
	public static void main(String[] args)
	{
		Cool c=new Goolata();
		  c.add();
		  Goolata g=(Goolata)c;
		  g.disp();
	}
}