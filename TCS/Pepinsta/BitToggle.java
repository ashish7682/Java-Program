import java.util.*;
class BitToggle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        String s1=Integer.toBinaryString(decimal);
        String s2="";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='0')
            {
                s2=s2+'1';
            }
            else
            {
                s2=s2+'0';
            }
        }
        int d2=Integer.parseInt(s2,2);
        System.out.println(d2);
    }
}