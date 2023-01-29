class Sector
{
void area()
{
	int r=10;
    double t=6.67;
	double res=0.5*r*r*t;
	System.out.println(res);

}
public static void main(String[] args)
{
    new Sector().area();
}
}