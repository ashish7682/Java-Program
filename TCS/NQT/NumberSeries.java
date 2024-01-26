import java.util.*;
class NumberSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=0;
        for(int i=1;i<=n;i++)
        {
           if(i%2!=0)
           {
              if(i>1)
              {
                a=a+2;
              }
           }
           else
           {
            b=a/2;
           }
        }
        if(n%2!=0)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }

        
    }
}