class Sector
{

void area()
{
	int  r=3;
	double t=30.142;
	double res=0.5*t*r*r;
	System.out.println(res);

}
public static void main(String[] args)
{
	Sector s1=new  Sector();
	s1.area();
}
}