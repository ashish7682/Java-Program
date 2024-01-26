/*import java.util.*;
class NumberSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int r=0;
        for(int i=1;i<=n;i++)
        {
            if( i % 2!=0)
            {
              System.out.print(7 * k+" ");
              k++;
            }else
            {
                System.out.print(6 * r+" ");
                r++;
            }
        }
    }
}
 Tnput-15
 O/P-0 0 7 6 14 12 21 18 28 24 35 30 42 36 49 */


import java.util.*;
class NumberSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        int k=0;
        int r=0;
        for(int i=1;i<=n;i++)
        {
            if( i % 2!=0)
            {
              list.add(k*7);
              k++;
            }else
            {
                list.add(r*6);
                r++;
            }
        }
        System.out.print(list.get(list.size()-1));
    }
}