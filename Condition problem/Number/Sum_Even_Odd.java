import java.util.Scanner;
class Sum_Even_Odd
{
    public static void main(String args[])
    {
        int n1,n2,sum1=0,sum2=0,i;
        System.out.print("Enter Starting Range:");
        Scanner ref=new Scanner(System.in);
        n1=ref.nextInt();
        System.out.print("Enter Ending Range:");
        n2=ref.nextInt();
        for(i=n1;i<=n2;i++)
        {
            if(i%2==0)
            {
                sum1=sum1+i;
            }else{
                sum2=sum2+i;
            }
        }
        System.out.println("Sum of Even number:"+sum1);
        System.out.println("Sum of odd number:"+sum2);
    }
}