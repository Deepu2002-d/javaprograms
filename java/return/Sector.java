class Sector
{
 static double sec()
 {
	int r=5;
	double t=3.5;
	double res=0.5*r*r*t;
	return res;
 }
 public static void main(String[] args)
 {
   double x=sec();
   System.out.println(x);
 }
}