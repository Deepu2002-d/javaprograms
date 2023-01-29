class Oddfact
{
public static void main(String[] args)
{
	for(int i=1;i<=10;i++)
	{
	   if(i%2==1)
	   {
	   int no=i;
	    int fact=1;
	   for(int j=no;j>=1;j--)
	   {
	     fact=fact*j;
	   }
	   System.out.println(i+" "+fact);
	   }
	}
	
}
}