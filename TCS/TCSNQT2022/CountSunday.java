// Input 

// mon-> input String denoting the start of the month.

// 13  -> input integer denoting the number of days from the start of the month.

// Output :

// 2    -> number of days within 13 days.
import java.util.*;
class CountSunday
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        String a[]={"mon","tue","wed","thr","fri","sat"};
        int res=1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].equals(s))
            {
                int rem=6-i;
                n=n-rem;
                if(n>0)
                {
                    res=res+(n/7);
                }
                break;
            }
            
        }
        System.out.print(res);
    }
}