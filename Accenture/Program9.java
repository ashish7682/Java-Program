import java.util.*;
class Program9
{
    int input(int m,int n)
    {
       int sum=0;
       for(int i=m;i<n;i++)
       {
           if(i%3==0 && i%5==0)
           {
               sum=sum+i;
           }
       }
       return sum;
    }
    public static void main(String args[])
    {
        int m=100;
        int n=160;
        Program9 ref=new Program9();
        int output=ref.input(m,n);
        System.out.println(output);
        
    }
}