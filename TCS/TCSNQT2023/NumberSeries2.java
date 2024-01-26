/*import java.util.*;
class Numberseries2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int r=0;
        for(int i=1;i<=n;i++)
        {
           if(i % 2!=0)
           {
            int pow2=(int)Math.pow(2,k);
            k++;
            System.out.print(pow2+" ");
           }else
           {
            int pow3=(int)Math.pow(3,r);
            r++;
            System.out.print(pow3+" ");
           }
        }
    }
}*/
import java.util.*;
class Numberseries2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        int r=0;
        for(int i=1;i<=n;i++)
        {
           if(i % 2!=0)
           {
            int pow2=(int)Math.pow(2,k);
            k++;
            // System.out.print(pow2+" ");
            list.add(pow2);
           }else
           {
            int pow3=(int)Math.pow(3,r);
            r++;
            // System.out.print(pow3+" ");
            list.add(pow3);
           }
        }
        System.out.println(list.get(list.size()-1));
    }
}   