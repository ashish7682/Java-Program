import java.util.*;
class MultipliedSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        while(n % 3!=0)
        {
            n=n-2;
            p=p*2;
        }
        int result=p*(int)Math.pow(3,n/3);
        System.out.println(result);
    }
}