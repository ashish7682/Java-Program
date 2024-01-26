import java.util.*;
class Factorial
{
    public static int Print(int n)
    {
        if(n==0)
        {
            return 1;
        }else{
            return n*Print(n-1);
        }
    }

    public static void main(String args[])
    {
        System.out.println("Enter a number: ");
        Scanner ref=new Scanner(System.in);
        int n=ref.nextInt();
        int x=Print(n);
        System.out.print("Factorial= "+x);
    }
}