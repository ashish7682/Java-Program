import java.util.*;
class NumberTwist3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        if(n%2!=0)
        {
            result=n-1;
            System.out.println(result);
        }
        else
        {
           int count=0;
           for(int i=1;i<=n;i=i+2)
           {
               count++;
           }
           System.out.println(count-1);
        }
    }
}
//pattern-0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8
// input:18
// o/p-8