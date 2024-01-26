import java.util.*;
class MagicNumber
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
        for(int i=0;i<a.length;i++)
        {
            int sqrt=(int)Math.sqrt(a[i]);
            if(sqrt*sqrt==a[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}