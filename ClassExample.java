class Employee
{
	String name;
	int salary;
	String cname;
	void input(String n,int s, String c)
	{
		name=n;
		salary=s;
		cname=c;
	}
	void show()
	{
		System.out.println(name+" "+salary+" "+cname);
	}
}
class ClassExample
{
	public static void main(String args[])
	{
	Employee e1=new Employee();
	Employee e2=new Employee();
	e1.name="Ram ";
	e1.salary=123000;
	e1.cname="INCAPP ";
	e2.input("Tina ",321000," INCAPP ");
	System.out.println(e1.name+" "+e1.salary+" "+e1.cname);
	e2.show();
	}
}