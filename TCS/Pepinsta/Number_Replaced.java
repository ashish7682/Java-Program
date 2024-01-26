import java.util.*;
class ReplaceDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        if(n>1000000 || n<0)
        {
            System.out.println("Wrong Input");
        }
        else
        {
            while(n!=0)
            {
                int rem=n%10;
                sum=sum+(int)Math.pow(10,i)*(9-rem);
                i++;
                n=n/10;
            }
             System.out.println(sum);
        }
       
    }
}
// intpu:123
// o/p:  876

// input:105671
// o/p:894328

// input:1000000
// o/p:Wrong Data

// if n>1000000 or n<0 o/p Wrong Data