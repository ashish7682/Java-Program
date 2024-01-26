/*import java.util.*;
import java.math.BigInteger;

class Practice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger fact=BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);

    }
}*/
import java.util.*;

class Practice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String  s=sc.next();
        // int temp=Integer.parseInt(s);
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
              String s1=s.substring(i,j);
            //   System.out.println(s1);
              int sum=0;
              for(int k=0;k<s1.length();k++)
              {
                sum=sum+s1.charAt(k)-'0';
                
                // sum=sum+Character.getNumericValue(s1.charAt(k));
              }
              if(sum!=s1.length())
              {
                count++;
              }
            }
        }
        System.out.println(count);
    }
}