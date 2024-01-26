import java.util.*;
class Largest_SmallestDiff
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
        Arrays.sort(a);
        int diff=(a[n-1]-a[0]);
        System.out.println(diff);
        
    }
}