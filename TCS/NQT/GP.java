import java.util.*;
class GP
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        { 
            int x=(int)Math.pow(3,n/2-1);
            System.out.println(x);
        }
        else
        {
            int y=(int)Math.pow(2,n/2);
            System.out.println(y);
        }
    }
}