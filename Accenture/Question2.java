import java.util.*;
class Question2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        set.add(a[0]);
        set.add(a[1]);
        set.add(a[2]);
        set.add(a[3]);
        int result=4-set.size();
        System.out.print(result);
        
    }
}