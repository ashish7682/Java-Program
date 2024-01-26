import java.util.*;
class FindTotalSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int sum=0;
        for(int i=b-1;i<n-1;i++)
        {
          sum+=(Math.abs(a[i]-a[i+1]));
         
        }
        System.out.println(sum);
        
    }
}