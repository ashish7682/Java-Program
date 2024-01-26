import java.util.Scanner;
class Sum_Even_odd
{
    public static void main(String args[])
    {
        int n,sum1=0,sum2=0;
        System.out.print("Enter your Range:  ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum1=sum1+i;
            }else{
                sum2=sum2+i;
            }
        }
        System.out.println("Sum of even number="+sum1);
        System.out.println("sum of odd numbers="+sum2);

    }
}