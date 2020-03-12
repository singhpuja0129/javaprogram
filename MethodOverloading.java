class Overload
{
	void add(int a,int b)
	{
	System.out.println("No. Addition="+(a+b));
	}
	void add(double a,double b)
	{
	System.out.println("Floating point Addition="+(a+b));
	}
	String add(String a,String b)
	{
	return(a+b);
	}
}
class MethodOverloading
{
	public static void main(String s[])
	{
		Overload ovd=new Overload();
		ovd.add(5,4);
		ovd.add(2.3,5.1);
		String a=ovd.add("Hello "," bye");
		System.out.println("String Addition="+a);
	}
}