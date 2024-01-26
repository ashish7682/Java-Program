import java.util.*;
class MaximumNumberOfGuest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e[]=new int[n];
        for(int i=0;i<e.length;i++)
        {
            e[i]=sc.nextInt();
        }
        int l[]=new int[n];
        for(int i=0;i<l.length;i++)
        {
            l[i]=sc.nextInt();
        }
        int max=0;
        int present=0;
        for(int i=0;i<e.length;i++)
        {
            present=present+e[i]-l[i];
            max=Math.max(max,present);
        }
        System.out.println(max);
    }
}