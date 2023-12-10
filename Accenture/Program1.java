import java.util.*;
class Program1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum1=0,sum2=0,diff;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                sum1=sum1+i;
            }
            else
            {
                sum2=sum2+i;
            }
        }
        diff=Math.abs(sum1-sum2);
        System.out.println(diff);
    }
}