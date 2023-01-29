class Sample5
{
public static void main(String[] args)
{
	Byte[] arr=new Byte[4];
	arr[0]=13;
	arr[1]=62;
	arr[2]=23;
	arr[3]=23;
		System.out.println("*************************");
		System.out.println("index \t values");
		System.out.println("*************************");
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(i+"\t"+arr[i]);
		}
}
}