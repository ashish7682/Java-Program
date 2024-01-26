import java.util.*;
import java.math.BigInteger;
class Fact{
public static void main(String args[])
{
    Scanner ref=new Scanner(System.in);
    int t=ref.nextInt();
    while(t-->0)
    {
    int n;
    BigInteger fact=new BigInteger("1");
n=ref.nextInt();
    for(int i=2;i<=n;i++ )
    {
        fact=fact.multiply(BigInteger.valueOf(i));
    }
    System.out.println(fact);
    }  
    ref.close();
}
}
