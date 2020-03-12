import java.util.*;
class SortEx
{
	public static void main(String args[])
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter Elements of Array:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(a[j]>a[j+1]){
				    temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++){
			System.out.print(a[i] +" ");
		}
		//Arrays.sort(arr);
		//System.out.println("Modified arr[]: %s",Arrays.toString(arr));
	}
}