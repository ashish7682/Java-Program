import java.util.*;
class Minimum_Opearation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
           if(n%2==0)
           {
            n=n/2;
            count++;
           }else
           {
            n=n-1;
            count++;
           }
        }
        System.out.println(count);
    }
}

/*Example-1:

Input:
N = 8
Output: 4
Explanation: 
0 + 1 = 1 --> 1 + 1 = 2 --> 2 * 2 = 4 --> 4 * 2 = 8.

Example-2:

Input: 
N = 7
Output: 5
Explanation: 
0 + 1 = 1 --> 1 + 1 = 2 --> 1 + 2 = 3 --> 3 * 2 = 6 --> 6 + 1 = 7.*/