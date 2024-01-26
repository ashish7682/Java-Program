import java.util.*;
class Special_Number
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int fact;
        int sum=0;
        while(n!=0)
        {
             fact=1;
            int rem=n%10;
            for(int i=1;i<=rem;i++)
            {
               fact=fact*i; 
            }
            sum=sum+fact;
            n=n/10;
        }
       // System.out.println(sum);
        if(sum==temp)
        {
            System.out.println("Special Number");
        }
        else
        {
            System.out.println("Not special number");
        }
    }
}