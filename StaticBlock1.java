
class StaticBlock1{
static int j=10;
static
{
System.out.println("This is static block with value "+j);
}
public static void main(String args[])
{
System.out.println("This is inside the main block");
A a=new A();
a.show();
}
}
class A{
int i;
void show()
{
System.out.println("hi A");
}
static
{
System.out.println("hello A ");
}
}