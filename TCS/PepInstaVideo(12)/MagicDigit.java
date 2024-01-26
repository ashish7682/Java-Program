import java.util.*;
class MagicDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        if(a[0]==a[n-1])
        {
            System.out.println("0");
        }else
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[0]==a[i])
                {
                    count++;
                }
            }
        }
        System.out.println(n-count);
    }
}