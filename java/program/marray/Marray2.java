class Marray2
{
  static void array(int[] arr)
  {
	for(int i=0;i<arr.length;i++)
	{ 
		if(arr[i]%2==1)
		{
	 System.out.println(arr[i]);
	}
	}
  }
  public static void main(String[]args)
	{
	  int[] arr1={1,2,3,4,5,6,7,8,9,10};
	  array(arr1);
	}
}