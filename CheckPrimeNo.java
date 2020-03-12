import java.util.*;
public class CheckPrimeNo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                temp=temp+1;
            }
            else
            {
                temp=0;
            }
        }
        if(temp==0)
        {
       System.out.println(num+" is a Prime No"); 
        }
        else
        {
            System.out.println(num+" is Not a Prime NO");
        }
    }
}
