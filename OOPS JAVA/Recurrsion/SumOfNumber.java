import java.util.*;
class SumOfNumber
{
    public static int Print(int n)
    {
        if(n==0)
        {
            return 0;
        }else{
            return n+Print(n-1);
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter number:");
        Scanner ref=new Scanner(System.in);
        int n=ref.nextInt();
       int x= Print(n);
       System.out.println(x);
    }
}