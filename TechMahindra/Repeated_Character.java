import java.util.*;
class GFG
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i=i-2)
        {
            int a=s.charAt(i)-'0';
            for(int j=a;j>0;j--)
            {
                sb.append(s.charAt(i-1));
            }
        }
        String res=sb.reverse().toString();
        char ch='\0';
        if(n>s.length())
        {
            ch='1';//Actually -1
        }else
        {
             ch=s.charAt(n-1);
        }
       
        System.out.println(ch);
        
    }
}