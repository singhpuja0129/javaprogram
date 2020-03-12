class B{
	int x;
B(){
	x=2;
	System.out.println("Hello Baby");
}
void view()
{
System.out.println("Value of x "+x);
}
}
class DefaultConstructor1
{
public static void main(String args[])
{
B x=new B();
B y=new B();
x.view();
y.view();
}
}
