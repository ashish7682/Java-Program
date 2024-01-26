/*import java.util.*;
import java.math.BigInteger;
class DivideByBigNumber
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String bignumber=sc.nextLine();
       String k=sc.next();
       BigInteger num=new BigInteger(bignumber);
       BigInteger div=new BigInteger(k);
       BigInteger res=num.divide(div);
       System.out.println(res);
    }
}*/
import java.util.*;
class DivideByBigNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String key=sc.nextInt();
        int num,rem=0;
        for(int i=0;i<s.length();i++)
        {
            num=(rem*10)+(s.charAt(i)-'0');
            rem=num%key;
        }
     System.out.println(rem);
    }
}


