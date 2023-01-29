class Elli
{
void area(int a,int b)
{
	
	double pi=3.142;
	double res=pi*a*b;
	System.out.println(res);

}
}
class Ellipse
{

public static void main(String[] args)
{
	Elli s1=new  Elli();
	s1.area(2,3);
}
}