import java.util.*;
class StringTwist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();
        String s4="";
        String s5="";
        String s6="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||
               s1.charAt(i)=='U'||s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||
               s1.charAt(i)=='o'||s1.charAt(i)=='u')
            {
                s4=s4+"%";
            }
            else
            {
                s4=s4+s1.charAt(i);
            }
        }
        // System.out.println(s4); h%w
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='A'||s2.charAt(i)=='E'||s2.charAt(i)=='I'||s2.charAt(i)=='O'||
               s2.charAt(i)=='U'||s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||
                s2.charAt(i)=='o'||s2.charAt(i)=='u')
            {
                s5=s5+s2.charAt(i);
            }
            else
            {
                s5=s5+"#";
            }
        }
        s6=s3.toUpperCase();
        System.out.println(s4+" "+s5+" "+s6);
    }
}