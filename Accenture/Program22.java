import java.util.*;
class Program22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+(int)Math.pow(i,2);
        }
        System.out.println(sum);
    }
}