class Sample
{
 void Col()
	{
	 System.out.println(" hello uo casting");
	}
}
class Guleylu extends Sample
{
	void dis()
	{
		System.out.println(" hello world");
	}
}
class Typ5
{
	public static void main(String[] args)
	{
		Sample s1=new Guleylu();
		s1.dis();
		     
		 
		  
	}
}