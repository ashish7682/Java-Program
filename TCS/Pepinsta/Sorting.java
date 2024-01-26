import java.util.*;
class Sorting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
           
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

}

}
// Input:
// 10
// 2 1 0 2 1 0 0 1 2 0

// o/p- 0 0 0 0 1 1 1 2 2 2 



