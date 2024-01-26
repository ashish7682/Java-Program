import java.util.*;
class Automorphic
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n%10;
        int square=n*n;
        int rem=square%10;
        if(temp==rem)
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
    }
}