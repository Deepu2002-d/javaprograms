class Sample7
{
public static void main(String[] args)
{
	double[] arr=new double[4];
	arr[0]=13.6;
	arr[1]=62.7;
	arr[2]=23.5;
	arr[3]=23.6;
		System.out.println("*************************");
		System.out.println("index \t values");
		System.out.println("*************************");
		for(int i=0;i<=arr.length;i++)
		{
		System.out.println(i+"\t"+arr[i]);
		}
}
}