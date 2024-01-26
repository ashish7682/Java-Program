import java.util.*;
class NumberTwist4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0,k=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
              System.out.print(j*2+" ");
               j++;
            }
            else
            {
                System.out.print(k+" ");
                 k++;   
            }
        }
        System.out.println();
        if(n%2==0)
        {
          System.out.println("The "+n+" th element of the series is: "+(j-1));  
        }
        else
        {
         System.out.println("The "+n+" th element of the series is: "+(n-1));  
        }
    }
}