import java.util.*;
class K_Smallest
{
	a[],temp,n,k;
	public static void main(String args[])
	System.out.println("Enter size of array");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();		//size of array
	k=sc.nextInt();		//kth position
	a=new int[n];		//array of size 
	
	//enter the element of array
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	
	//Sort the array in ascending order......
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	//print kth smallest element
	System.out.println(a[k-1]);
}