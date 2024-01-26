import java.util.*;
class LastElementZero
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
        int j=0;
        int b[]=new int[n];
        for(int i=0;i<b.length;i++)
        {
            if(a[i]!=0)
            {
                b[j]=a[i];
                j++;
            }
        }
        
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}