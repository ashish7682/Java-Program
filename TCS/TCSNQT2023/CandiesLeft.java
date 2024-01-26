import java.util.*;
class CandiesLeft
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=10,k=5;
        if(n>=1 && n<=5)
        {
            System.out.println("Number of candies Sold:"+ n);
            System.out.println("Number of candies left:  "+(total-n));
        }else
        {
            System.out.println("Invalid Input");
            System.out.println("Number of Candsies left: "+n);
        }
    }
}