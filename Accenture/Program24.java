import java.util.*;
class Program24
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        int num=ref.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}