import java.util.*;
import java.io.*;
class ReverseNum
{
	public static void main(String args[])
	{
		System.out.println("Enter number to reverse: ");
		Scanner sc=new Scanner(System.in);
		int original=sc.nextInt();
		int rev=0;
		int rem;
		
		while(original != 0)
		{
			rem=original % 10;
			rev=rev*10+rem;
			original=original/10;
		}
		
		System.out.println("Reverse of number is: "+rev);
	}
}