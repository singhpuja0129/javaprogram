//	1,2,3,4,5........n terms

import java.io.*;
import java.util.*;
class SeriesDisplay
{
	public static void main(String args[])
	{
		System.out.println("Enter any no.=");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,series;
		for(i=1;i<=n;i++)
		{
			
			if(n!=0)
			System.out.print(i+",");
			else
			System.out.print(i);
		}
	}
}