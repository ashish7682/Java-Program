import java.util.*;
class PrimeRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
     
        for(int i=low;i<=high;i++)
        {
            int flag=1;
            for(int j=2;j<=i/2;j++)
            {
                if(i % j==0)
                {
                    flag=0;
                }
            }
        
            if(flag==1)
            {
                System.out.println(i);
            }
        }
    }
}   