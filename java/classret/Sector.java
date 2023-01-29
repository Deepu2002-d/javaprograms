class Sec
{
 static double sec()
 {
	int r=5;
	double t=3.5;
	double res=0.5*r*r*t;
	return res;
 }
}
class Sector
{

 public static void main(String[] args)
 {
	 Sec s1=new Sec();
    double x=s1.sec();
   System.out.println(x);
 }
}