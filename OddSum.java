import java.io.*;
class OddSum
{
	public static void main(String args[])
	{
	int arr[]={5,4,8,7,9};
	int odd=0;
	for(int i=0;i<arr.length;i++)
	{
	if(i%2==1)
	odd += arr[i];
	}
	System.out.println("Sum of odd no. of given array= "+odd);
	}
}