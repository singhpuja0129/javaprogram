import java.io.*;
import java.util.*;
class Greatest
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of Array:");
		for(int i=0;i<10;i++){
			arr[i]=sc.nextInt();
		}
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		if(temp<arr[i])
		{
		temp=arr[i];
		}
		
		}
		System.out.println("Greatest No.=" + temp);
	}
}