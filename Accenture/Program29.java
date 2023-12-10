import java.util.*;
class Program29
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        String reverse=new StringBuilder(s).reverse().toString();
        if(s.equals(reverse))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}