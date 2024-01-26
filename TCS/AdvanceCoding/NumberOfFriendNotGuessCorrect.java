import java.util.*;
class NumberOfFriendNotGuessCorrect
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
        int x=a[0];
        int y=a[n-1];
        int result=0;
        int count=0;
        if(x==y)
        {
            result=0;
        }else
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==x)
                {
                    count++;
                }
            }
            result=n-count;
        }
        System.out.println(result);
    }
}