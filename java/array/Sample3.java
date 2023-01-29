class Sample3
{
public static void main(String[] args)
{
	String[] arr=new String[4];
	arr[0]="Apple";
	arr[1]="Ball";
	arr[2]="Cat";
	arr[3]="Dog";
		System.out.println("*************************");
		System.out.println("index \t values");
		System.out.println("*************************");
		for(int i=0;i<=arr.length;i++)
		{
		System.out.println(i+"\t"+arr[i]);
		}
}
}