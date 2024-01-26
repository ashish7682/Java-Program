import java.util.*;
 class Factorial
 {
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.printf("Enter number :");
        int n=ref.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is :"+fact);
    }
 }