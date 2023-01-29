class Sample4
{
public static void main(String[] args)
{
	Short [] arr=new Short[4];
	arr[0]=12;
	arr[1]=12;
	arr[2]=23;
	arr[3]=23;
		System.out.println("*************************");
		System.out.println("index \t values");
		System.out.println("*************************");
		for(int i=0;i<=arr.length;i++)
		{
		System.out.println(i+"\t"+arr[i]);
		}
}
}