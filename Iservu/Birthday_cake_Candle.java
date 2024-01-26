import java.util.*;
class BirthDay_cake_Candle
{
    public static void main (String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        
        Arrays.sort(a);
        int count=0;
        int high=a[n-1];
        for(int i=0;i<a.length;i++)
        {
            if(high==a[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}