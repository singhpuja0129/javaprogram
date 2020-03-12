import java.io.*;
class EvenSum
{
	public static void main(String args[])
	{
	int arr[]={5,4,8,7,9};
	int even=0;
	for(int i=0;i<arr.length;i++)
	{
	if(i%2==0)
	even += arr[i];
	}
	System.out.println("Sum of even no. of given array= "+even);
	}
}