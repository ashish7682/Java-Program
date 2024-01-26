import java.util.*;
class SecreteMessage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res="";
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)<='u')
           {
             res=res+(char)(s.charAt(i)+5);
           } 
           else
           {
            res=res+(char)(s.charAt(i)-'v'+'a');
           }
        }
        System.out.println(res);
    }
}