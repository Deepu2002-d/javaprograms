class Sector
{
 static void sec(int r,double t)
 {
	
	double res=0.5*r*r*t;

	System.out.println(res);
	return;
 }
 public static void main(String[] args)
 {
   sec(5,3.5);
 }
}