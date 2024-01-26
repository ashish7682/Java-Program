import java.util.*;
class Palindrome
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String reverse=new StringBuilder(s).reverse().toString();
        if(s.equals(reverse))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}