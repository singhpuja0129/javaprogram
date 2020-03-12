import java.util.Scanner;
import java.io.*;
class Result
{
	public static void main(String args[])
	{
		int t;
		double r=0;
		System.out.println("Enter marks in all 5 subjects");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int h=sc.nextInt();
		int e=sc.nextInt();
		t=(p+c+m+h+e);
		r=(double)r/500;
		System.out.println("Total marks obtained in all subjects="+t);
		if(r>80.0 && r<=100.0)
		{
			System.out.println("GRADE A");
		}
		else if(r>60.0 && r<=80.0)
		{
			System.out.println("GRADE B");
		}
		else if(r>40.0 && r<=60.0)
		{
			System.out.println("GRADE C");
		}
		else if(r>30.0 && r<=40.0)
		{
			System.out.println("GRADE D");
		}
		else
		{
			System.out.println("GRADE E");
		}
	}
}