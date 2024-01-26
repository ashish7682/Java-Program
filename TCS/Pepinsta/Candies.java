import java.util.*;
class Candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=10,k=5;
        int num=sc.nextInt();
        if(num>=1 && num<=5)
        {
            System.out.println("Number of candies sold: "+num);
            System.out.println("Number of candies left: "+(n-num));

        }
        else
        {
            System.out.println("Invalid Input");
            System.out.println("Number of candies left: "+n);
        }
    }
}