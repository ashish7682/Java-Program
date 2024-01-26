import java.util.*;
class IntelligenceAgency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();
        int sum=0;
        while(N>0)
        {
            int rem=N%10;
            sum=sum+rem;
            N=N/10;
        }
        System.out.println(sum);
        int mul=sum*R;
        System.out.println(mul);
        int result=0;
        while(mul>0)
        {
            int rem2=mul % 10;
            result=result+rem2;
            mul=mul/10;

        }
        System.out.println(result);
    }
}