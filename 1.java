package my;
public class Dem
{
public static void main(String args[])
{
StringOp.print 1("Rahul");
StringOp.print 2("Rahul");
StringOp.print 3("Rahul");
StringOp.print 4("Rahul");
StringOp so=new StringOp();
System.out.println("squeeze string:"so.squeeze("I Love my India");
System.out.println("VowelCount:"+so.squeeze("I Love my India");
System.out.println("AlphabetCount:"so.squeeze("s d 4 1 2 3 5 0");
System.out.println("Palindrome:"so.squeeze("nitin");
}
}
class stringOp
{
static void print1(String s)
{
for (int x=0;x<s.length();x++)
{
for(int y=0;y<=x;y++)
System.out.print(s.charAt(y));
}
System.out.println();
}
}
static void print 2(String s)
{

static void print 3(String s)
{

static void print 4(String s)
{
}
String squeeze(String s)
{
String ns="";
for(int x=0;x<s.length();x++){
char c=s.charAt(x);
if c(!=' ');
}
}
return ns;
}
int vowelCount(String s)
{
int c=0;
//
return c;
}
int alphabeticCount(String s)
{
int c=0;
//
return c;
}
boolean palindrome(String s){
boolean c=false;
//
return c;
}
}