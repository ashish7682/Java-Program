import java.util.*;
class NumberTwist2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int result=0;
        for(int i=1;i<=n;i++)
        {
        if(n%2==0)
        {
            result=(int)Math.pow(3,(i/2-1));
        }else
        {
            result=(int)Math.pow(2,(i/2-1));
        }
        }
        System.out.println(n+" th element of the series is: "+result);
    }
}
// Enter the value of n:6
// 14 th element of the series is: 729
