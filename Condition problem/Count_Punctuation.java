import java.util.*;
class Count_Punctuation
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)=='?'||
            s.charAt(i)=='?'||s.charAt(i)=='.'||s.charAt(i)=='\''||
            s.charAt(i)=='\"'||s.charAt(i)==':')
            {
                count++;
            }
        }
        System.out.println(count);
        //............To print number of punctuation mark in a string.....//
        //  System.out.println("\'");
        // System.out.println("\"");
        
    }
}