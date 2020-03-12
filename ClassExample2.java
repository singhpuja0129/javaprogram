class Employee1
{
	String name;
	String cname;
	int salary;
	void input(String n, int s, String c)
	{
		name=n;
		salary=s;
		cname=c;
	}
	void show(){
	System.out.println(name+""+salary+""+cname);
	}
}
class ClassExample2
{
	public static void main(String s[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.name="Ram ";
		e1.salary=500000;
		e1.cname=" Incapp";
		e2.input("Tinu",100000,"home");
		System.out.println(e1.name+""+e1.salary+""+e1.cname);
		e2.show();
	}
}