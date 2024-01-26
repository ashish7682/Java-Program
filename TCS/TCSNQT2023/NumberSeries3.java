import java.util.*;
class NumberSeries3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int r=0;
        for(int i=1;i<=n;i++)
        {
            if(i % 2 != 0)
            {
               int res1= k * 2;
               k++;
               System.out.print(res1+" ");
            }else
            {
                int res2=r;
                r++;
                System.out.print(res2+" ");
            }
        }
    
    }
}