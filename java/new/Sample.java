class Sample
{
void add()
{
	int a=10;
	int b=30;
	int c=a+b;
	System.out.println(c);
}
public static void main(String[] args)
{
	new Sample().add();
	new Sample().add();
	new Sample().add();
}
}