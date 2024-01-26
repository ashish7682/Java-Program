import java.util.*;
class NumberTwist1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int j=0,k=0;
        for(int i=1;i<=n;i++)
        {
            
            if(i%2==0)
            {
               System.out.print(6*j+" ");
               j++;
            }
            else
            {
               System.out.print(7*k+" "); 
               k++;
            }
        }
        System.out.println();
        if(n%2==0)
        {
        System.out.println("The "+n +" th element of the series is: "+ ((j-1)*6));
        }else
        {
        System.out.println("The "+n +" th element of the series is: "+((k-1)*7));

        }
    }
}
// input-15
// o/p-0 0 7 6 14 12 21 18 28 24 35 30 42 36 49 
//15th element is 49
