import java.io.*;
import java.util.*;
class Palin1
{
	public static void main(String []s){
		int n,n1,rem,x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		n=sc.nextInt();
		n1=n;
		while(n!=0){
			rem=n%10;
			x=(x*10+rem);
			n=n/10;
		}
		if(x==n1){
			System.out.println(n1 + " is a palindrome no.");
		}
		else{
			System.out.println(n1 + " is not a palindrome no.");
		}
		
	}
}

