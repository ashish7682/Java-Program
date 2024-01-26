import java.util.*;
class Difference
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
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
         if(i%2==0)
         {
            even=even+a[i];
         }else
         {
            odd=odd+a[i];
         }
        }
        System.out.println(even-odd);
        
    }
}