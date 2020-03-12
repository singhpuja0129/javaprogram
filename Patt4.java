import java.io.*;
class Patt4
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)		//Nested for loop
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+j-1+" ");
			}
		System.out.println("");
		}
	}
}