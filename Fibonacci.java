import java.util.*;
public class Fibonacci {
    public static void main(String args[])
    {
   //     Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();
        int a=0,b=1,fibo=0;
        System.out.print(a+" "+b);
        for(int n=1;n<=;n++)
        {
            for(int i=0;i<=n;i++)
                fibo=a+b;                   //5->0 1 1 2 3  5 8
                System.out.print(" "+fibo);                            //SWAP
                a=b;
                b=fibo;
        }
    }
}
