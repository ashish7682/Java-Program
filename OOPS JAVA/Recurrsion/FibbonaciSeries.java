import java.util.*;
class FibbonaciSeries
{
    public static int Print(int a,int b,int n)
    {
        if(n==2)
        {
            return 0;
        }else{
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            return Print(a,b,n-1);
        }
    }
    public static void main(String args[])
    {

        System.out.print("Enter a Number: ");
        Scanner ref=new Scanner(System.in);
        int n=ref.nextInt();
        System.out.print("0 1 ");
        Print(0,1,n);
    }
}