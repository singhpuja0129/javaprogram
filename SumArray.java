import java.io.*;
public class SumArray{
	public static void main(String args[])
	{
		int sum=0, pro=1;
		int a[]={3,2,9,4,6,3,5};
		for(int i=0;i<a.length;i++)
			{
				if(i%2==0)
				{
					sum=sum+a[i];
				}
				else
				{
					pro=pro*a[i];
				}
			}
			System.out.println("Sum of odd position digits= "+sum);
			System.out.println("Product of even position= "+pro); 
		System.out.println(sum+pro);
	}
}