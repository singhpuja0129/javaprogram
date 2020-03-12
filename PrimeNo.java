import java.io.*;
class PrimeNo
{
public static void main(String args[])
{
	int n=0;
	int num=0;
	String primeNo="";
	for(i=1;i<=100;i++)
{
	int counter=0;
	for(num=i;num>=1;num--)
	{
		if(i%num==0)
		{
		counter=counter+1;
		}
	}
	if(counter ==2)
	{
	//Append the Prime number to the String
	primeNumbers=primeNumbers +i+ " ";
	}
}
System.out.println("Prime number from 1 to 100 are :");
System.out.println(primeNumbers);	
}	
}