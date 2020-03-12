//	3+8+15...........n terms

import java.io.*;
import java.util.*;
class Series1{
	public static void main(String args[]){
		System.out.println("Enter any no. =");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq,sum;
		for(int i=2;i<=n;i++){
		sq=(i*i)-1;
		sum=sq;
		if(i!=n){
			System.out.print(sq+"+");
		}
			else{
			System.out.print(sq);
			}
		}
	}
}
			