import java.util.*;
public class ArrayNsize {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
	System.out.println();
}
