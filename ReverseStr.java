import java.io.*;
import java.util.*;
class ReverseStr
{
	public static void main(String args[])
	{
		String original;
		String rev="";
		System.out.println("Enter String to reverse: ");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		
		int len=original.length();
		
		for(int i=len-1;i>=0;i--)
		
		rev=rev+original.charAt(i);
		
		System.out.println("Orignal String is: "+original);
		System.out.println("Reverse String is: "+rev);
	}
}