import java.util.*;
class Monkey_Eat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int j=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int res1=0,res2=0;
        if( n<0 && k<0 || j<0 || m<0 || p<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
        if(m%k==0)
        {
            res1=m/k;
        }
        else
        {
            res1=(m/k)+1;
        }
        if(p%j==0)
        {
            res2=p/j;
        }
        else
        {
            res2=(p/j)+1;
        }
        }
        int result=n-(res1+res2);
        System.out.println(result);
        
    }
}