import java.util.*;
class CheckTwoBinaryStringEqual
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s1=sc.next();
        String s2=sc.next();
        boolean b=false;
        if(s1.length()!=s2.length())
        {
           b=false;
        }
        int s1count1=0;
        int s1count0=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1')
            {
                s1count1++;
            }
            else if(s1.charAt(i)=='0')
            {
                s1count0++;
            }
        }
        int s2count1=0;
        int s2count0=0;
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='1')
            {
                s2count1++;
            }
            else if(s2.charAt(i)=='0')
            {
                s2count0++;
            }
        }
        if(s1count0==s2count0 && s1count1==s2count1)
        {
            b=true;
        }
        System.out.println(b);
    }
}