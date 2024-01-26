import java.util.*;
class ArrayLeftRotation
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
        int k=sc.nextInt();
        
       
        
        for(int i=0;i<k;i++)
        {
             int x=a[0];
            for(int j=1;j<a.length;j++)
            {
                a[j-1]=a[j];
            }
            a[n-1]=x;
        }
        
        for(int i=0;i<a.length;i++)
        {
           System.out.print(a[i]+" ");
        }
        
    }
}