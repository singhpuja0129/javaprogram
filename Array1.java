//	3+8+15...........n terms

import java.io.*;
import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no. =");
		int i,n,sq=0;
		for(i=1;i<=n;i++)
		{
		sq=(i*i)-1;
		if(i!=n)
			System.out.println(sq+",");
		else
			System.out.println(sq);
		}
	}
}