import java.util.Scanner;
class Armstrong
{
    public static void main(String args[])
    {
        int n,rem,sum=0,temp;
        System.out.print("Enter a number:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.print("It is an Armstrong Number.");
        }
        else{
            System.out.print("It is not an Armstrong Number.");
        }
    }
}