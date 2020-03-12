import java.io.*;
import java.util.*;
class Palindrome
{
	public static void checkPalindrome(String s)
	{
		String reverse = new StringBuffer(s).reverse().toString();
		if(s.equals(reverse)) 
		{
			System.out.println("yes");
		}
		else
		{
		System.out.println("No");
		}
	}
	public static void main(String args[]) throws java.lang.Exception
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		s=sc.next();
	checkPalindrome(s);
	}
}