class Employee4
{
	private String name;
	private static String cname;
	private int salary;
	public void input(String n,int s)
	{
		name=n;
		salary=s;
	}
public void show()
{
	System.out.println(name+" "+salary+" "+cname);
}
public static void cInput(String c)
{
	cname=c;
}
class ClassExample4
{
	public static void main(String args[]) 
	{
		Employee4.cInput("CAPGEMINI");
		Employee4 e1=new Employee4();
		Employee4 e2=new Employee4();
		e1.input=("Golu-1"+" "+310000);
		e2.input=("Golu-2"+" "+990000);
		e1.show();
		e2.show();
	}
}
}