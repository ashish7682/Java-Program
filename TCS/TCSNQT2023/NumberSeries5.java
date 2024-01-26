import java.util.*;
class NumberSeries5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        int r=1;
        for(int i=1;i<=n;i++)
        {
           if( i % 2!=0)
           {
            System.out.print(k+" ");
            k=k*2;
           }
           else
           {
            System.out.print(r+" ");
            r=r*3;
           }
        }
    
    }
}