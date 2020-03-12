import java.io.*;
import java.util.Scanner;
public class RemoveBlankSpace
{
	public static void main(String args[])
	{
		String s="This   is    my    name";
		int count=0;
		s=s.replaceAll("\\s+"," ").trim();
		String str[]=s.split(" ");
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='')
			{
				count++;
			}
		}
		System.out.print("Total no. of space="+count);
		System.out.print("Total no. of words="+str.length);
	}
}