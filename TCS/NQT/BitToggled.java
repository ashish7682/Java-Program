import java.util.*;
class BitToggled
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        String s1=Integer.toBinaryString(d1);
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
        // System.out.println(s1);//1010
        // System.out.println(s2);//0101
        int d2=Integer.parseInt(s2,2);
        System.out.println(d2);
        
    }
}