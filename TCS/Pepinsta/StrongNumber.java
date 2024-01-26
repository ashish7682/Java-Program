/* A number is said to be strong if sum of factorial of digits is equals
                          to the original number*/
import java.util.*;
class StrongNumber
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int fact=1;
        int sum=0;
        while(n!=0)
        {
           int rem=n%10;
           for(int i=1;i<=rem;i++)
           {
               fact=fact*i;
           }
           sum=sum+fact;
           n=n/10;
           fact=1;
        }
        if(temp==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}

// input:145
// o/p:Yes

// input:123
// o/p:No