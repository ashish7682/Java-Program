import java.util.*;
class NumberSeries2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        if(n==1||n==2)
        {
            result=1;
        }
        else if(n%2==0)
        {
            result=(int)Math.pow(3,n/2-1);
        }
        else
        {
             result=(int)Math.pow(2,n/2);
        }
         
      
        System.out.println(result);
        
    }
}

// sequence :1 1 2 3 4 9 8 27 16 81 32 243 64 729 128 2187.......
// i/p-16
// o/p-2187

// i/p-7
// o/p-8