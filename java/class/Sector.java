class Sec
{

void area()
{
	int  r=3;
	double t=30.142;
	double res=0.5*t*r*r;
	System.out.println(res);

}
}
class Sector
{

public static void main(String[] args)
{
	Sec s1=new  Sec();
	s1.area();
}
}