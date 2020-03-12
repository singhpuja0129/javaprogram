import java.io.*;
class Print3PrimeNo
{
	public static void main(String args[])
	{
		int i,n,count,test=0;
		for(n=1;n<=100;n++)
		{
		count=0;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
	
		if(test<3)
		{
		if(count==0 && n!=1)
		{
		System.out.println("Prime no."+n);
		test++;
		}
		}
		else{
			break;
			}
		}
	}
}
