import java.util.*;
class OddlyEven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int num1=0,num2=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                num1=num1+(s.charAt(i)-'0');
            }else
            {
                num2=num2+(s.charAt(i)-'0');
            }
        } 
        int result=Math.abs(num1-num2);
         System.out.println(result);
    }
}