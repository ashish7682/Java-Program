import java.util.*;
class MaximumContinuesSubsequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int horse=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=1;
       
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=i;j<a.length;j++)
            {
            sum=sum+a[j];
            if(sum<k)
            {
              count++;
            }else
            {
                max=Math.max(max,count);
                sum=0;
                break;
            }
            }
        }
        System.out.println(max);
    }
}