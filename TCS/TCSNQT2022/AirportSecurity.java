// Example :

// Input :

// 7  -> Value of N

// [1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

// Output :

// 0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

// Example 2:

// input : 10  -> Value of N 

// [2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

// Output : 

// 0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity
import java.util.*;
class AirportSecurity
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
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}