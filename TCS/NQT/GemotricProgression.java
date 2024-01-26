import java.util.*;
class GemotricProgression
{
    public static void main(String args[])
    {
        int a=1,b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                if(i==1)
                {
                    a=1;
                }
                else
                {
                    a=a*2;
                }
            }
            else
            {
                if(i==2)
                {
                    b=1;
                }
                else
                {
                    b=b*3;
                }
            }
        }
        if(n%2!=0)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}