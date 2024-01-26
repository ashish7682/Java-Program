import java.util.*;
class DenominationCoin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int one=0;
        int two=0;
        int five=(n-4)/5;
        if(( n - 5 * five )%2==0)
        {
            one=2;
        }else
        {
            one=1;
        }

        two=(n-5*five-one)/2;
        int total=one+two+five;


        System.out.print(total+" "+one+" "+" "+two+" "+five);

    }
}