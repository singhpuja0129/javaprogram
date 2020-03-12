class MyClass1
{
int x;
static int i=0;
public static void main(String args[])
{
MyClass1 m1=new MyClass1();
m1.x=5;
m1.i=33;
MyClass1 m2=new MyClass1();
m2.x=4;
m2.i=22;
MyClass1 m3=new MyClass1();
m3.x=3;
m3.i=99;
System.out.println("value of x="+m1.x);
System.out.println("value of i="+m1.i);
}
}