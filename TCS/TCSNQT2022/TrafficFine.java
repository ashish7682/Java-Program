import java.util.*;
class TrafficFine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int D=sc.nextInt();//date
        int X=sc.nextInt();//fine
        int count=0;//number of Defaulter
        for(int i=0;i<a.length;i++)
        {
            if((D % 2 == 0  && a[i] % 2 != 0 )  || (D % 2 != 0  && a[i] % 2 == 0 )  )
            {
               count++;
            }
        }
        int result=X * count;
        System.out.println(result);
    }
}