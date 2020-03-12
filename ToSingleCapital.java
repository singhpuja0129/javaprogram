import java.util.Scanner;
public class ToSingleCapital {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        s=" "+s;
        String f="";
        for(int i=0;i<a.length;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                f=f+ch;
                i++;
                ch=s.charAt(i);
                f=f+s.toUpperCase();
            }
            else
            {
                f=f+ch;
            }
        }
        f=f.trim();
        System.out.println("MODIFIED SENTENCE="+f);
    }    
}
