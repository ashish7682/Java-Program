import java.util.*;
class Total_Interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int interest=0;
        for(int i=0;i<n;i++)
        {
          if(a[i]>2000)
          {
              interest=interest+(a[i]*20)/100;
          }
        }
        System.out.println(interest);
        
    }
}