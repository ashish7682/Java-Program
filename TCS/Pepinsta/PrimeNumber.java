import java.util.*;
class PrimeNumber
{
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    //Input a number by the user
    System.out.println("Enter the number to be checked");
    int n=sc.nextInt();
    //Create a object of class to check Prime
    PrimeNumber obj=new PrimeNumber();
    obj.check(n);
}

void check(int n)
{
    if(n<0)
    {
        System.out.println("Please Enter a positive number");
    }
    else
    {
        prime(n);
    }
}

void prime(int n)
{
    int count=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        System.out.println("Prime Number");
    }
    else
    {
        System.out.println("Not a prime Number");
    }
}
}