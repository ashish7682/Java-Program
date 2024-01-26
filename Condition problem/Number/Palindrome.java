import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        int n,rev,sum=0,rem;
        System.out.print("Enter a Number:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        rev=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(sum==rev)
        {
            System.out.print("It is a palindrome Number.");
        }else{
            System.out.print("It is not a palindrome Number.");
        }
    }
}