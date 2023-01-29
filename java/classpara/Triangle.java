class Tri
{
void area(int b,int h)
{
	
	double res=0.5*b*h;
	System.out.println(res);

}
}
class Triangle
{
public static void main(String[] args)
{
	Tri s1=new Tri();
	s1.area(10,10);
}
}