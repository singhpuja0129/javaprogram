// 1/2 + 1/3 + 1/4 .......1/n

import java.io.*;
import java.util.*;
class Series2{
	public static void main(String args[]){
	System.out.println("Enter any no.");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	float a=2;
//	float s=0;
	float d;
	System.out.println("Your no. is: ");
	for(int i=0;i<=n-1;i++){
		d=(float)(1/a);
		int c=(int)a;
	System.out.println(1+"/"+c);
		if(i<n-1){
		System.out.print("+");
		}
			else{
				sum=(int)(sum+d);
				a=a+1;
			}
			System.out.println();
			System.out.println("Your result is: "+sum);
		}
	}
	
}