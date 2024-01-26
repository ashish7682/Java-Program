import java.util.*;
class Palindrome_Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        int n=sc.nextInt();
        String a[]=s.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            StringBuilder sb=new StringBuilder(a[i]);
            if(sb.reverse().toString().equalsIgnoreCase(a[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}