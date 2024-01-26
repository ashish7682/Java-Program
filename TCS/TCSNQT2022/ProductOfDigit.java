import java.util.*;
class ProductOfDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=1;
        while(n>0)
        {
            int rem=n%10;
            res=res*rem;
            n=n/10;
        }
        System.out.println(res);
    }
}