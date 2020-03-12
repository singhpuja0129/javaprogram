class Employee2
{
int salary;
String name,company;
void input(String n, int s, String c)
{
name=n;
salary=s;
company=c;
}
void show(){
System.out.println(name+""+salary+""+company);
}
}
class ClassExample3{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
e1.input("Golu",60000,"Capgemini");
e2.input("Tanuja",1000000,"Live Tech");
e1.show();
e2.show();
}
}