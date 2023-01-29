class Triangle
{
void area(int b,int h)
{
	
	double res=0.5*b*h;
	System.out.println(res);

}
public static void main(String[] args)
{
	Triangle s1=new Triangle();
	s1.area(10,10);
}
}