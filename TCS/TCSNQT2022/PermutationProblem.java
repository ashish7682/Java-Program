import java.util.*;
import java.math.BigInteger;
class PermutationProblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger res=BigInteger.ONE;
        for(int i=1;i<n;i++)
        {
            res=res.multiply(BigInteger.valueOf(i));
        }
        BigInteger fact=res.multiply(BigInteger.valueOf(2));
        System.out.print(fact);
    }
}