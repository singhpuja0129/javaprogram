import java.util.*;
import java.io.*;
class Grade1
{
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter any digit between 1 to 100");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>90 && n<=100)
		{
			System.out.println("A");
		}
		else if(n>80 && n<=90)
		{
			System.out.println("B");
		}
		else if(n>70 && n<=80)
		{
			System.out.println("C");
		}
		else if(n>60 && n<=70)
		{
			System.out.println("D");
		}
		else 
		{
			System.out.println("E");
		}
	}
}