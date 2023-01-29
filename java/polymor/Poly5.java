class Cloth
{
 void Envi()
 {
    System.out.println(" store something");
 }
}
class Shirt extends   Cloth
{
 void Envi()
 {
    System.out.println(" some shirt");
 }
}
class t_Shirt extends  Cloth
{
 void  Envi()
 {
    System.out.println(" some t-shirt");
 }
}
 class pant extends  Cloth
{
 void  Envi()
 {
    System.out.println(" some pant");
 }
}
class Industry
{
 static void manu(  Cloth c1)
 {
   c1.envi();
 }
}
class Poly5
{
public static void main(String[] args)
{
	Shirt d1=new Shirt();
	t_Shirt s1=new t_Shirt();
	 pant p1=new pant();
		Industry.manu(d1);
		Industry.manu(s1);
		Industry.manu(p1);
}
}