import java.io.*;
import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter a year: ");
		year=sc.nextInt();
		sc.close();
		if(year % 400 ==0)
		System.out.println(year+ " Is a leap year ");
		else
		System.out.println(year+ " Is NOT A leap year ");
	}
}