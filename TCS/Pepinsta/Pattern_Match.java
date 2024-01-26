import java.util.*;
class Pattern_Match
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                count1++;
            }
            else
            {
                count2++;
            }
        }
        if(count1==count2)
        {
            System.out.println("0");
        }
        else if(count1>count2)
        {
            System.out.println(count1-count2);
        }
        else
        {
            System.out.println(count1-count2);
        }
    }
}