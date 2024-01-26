import java.util.*;
class PriorElement
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
        int max=a[0];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>=max)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}