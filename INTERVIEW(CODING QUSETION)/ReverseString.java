import java.util.*;
class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        String res=sb.reverse().toString();
        System.out.println(res);
    }
}