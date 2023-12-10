import java.util.*;
class Program15
{
    public static int autoBio(String n)
    {
        int a[]=new int[n.length()];
        //calculate the frequnecy
        for(int i=0;i<n.length();i++)
        {
            a[n[i]-'0']++;
        }
        //AutoBio Num are not
        for(int i=0;i<n.length();i++)
        {
            if(a[i]!=n[i]-'0')
            {
                return 0;
            }
        }
        int count=0;
        for(int i=0;i<10;i++)
        {
            if(a[i]>0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(autoBio(s));
    }
}