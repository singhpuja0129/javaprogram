import java.io.*;
import java.util.*;
class FiboSeries
{
	public static void main(String args[])
	{
		int a=1,b=1,k;
		Scanner sc=new Scanner(System.in); 
		k=0;
		System.out.println("Enter any no for Fibonacci Series");
		int n=sc.nextInt();
		System.out.println("1 1");
		while(k<=n)
		{
		k=a+b;
		if(k>=n)
			break;
		System.out.println(k+" ");
		a=b;
		b=k;
		}
	}
}