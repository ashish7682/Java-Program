import java.util.*;
class Chocolate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==0)
            {
                count++;
            }
        }
        int b[]=new int[n];
        int j=0;
        for(int i=0;i<b.length;i++)
        {
            if(a[i]!=0)
            {
                b[j++]=a[i];
            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
// Input :
// 8  – Value of N
// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1]

// Output:
// 4 5 1 9 5 0 0 0

// Example 2:

// Input:
// 6 — Value of N.
// [6,0,1,8,0,2] – Element of arr[0] to arr[N-1]

// Output:
// 6 1 8 2 0 0





