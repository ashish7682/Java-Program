import java.util.*;
class Min_Max_Sum
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int min_sum=a[0]+a[1]+a[2]+a[3];
        int max_sum=a[n-1]+a[n-2]+a[n-3]+a[n-4];
        System.out.println(min_sum);
        System.out.println(max_sum);
    }
}