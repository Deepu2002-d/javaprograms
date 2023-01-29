class Sample8
{
public static void main(String[] args)
{
	float[] arr=new float[4];
	arr[0]=13.63f;
	arr[1]=62.74f;
	arr[2]=23.54f;
	arr[3]=23.64f;
		System.out.println("*************************");
		System.out.println("index \t values");
		System.out.println("*************************");
		for(int i=0;i<=arr.length;i++)
		{
		System.out.println(i+"\t"+arr[i]);
		}
}
}