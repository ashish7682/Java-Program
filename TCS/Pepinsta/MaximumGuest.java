import java.util.*;
class MaximumGuest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int res[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+(a[i]-b[i]);
            res[i]=sum;
        }
        Arrays.sort(res);
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(res[i]);
        // }
        System.out.println(res[n-1]);
    }
}