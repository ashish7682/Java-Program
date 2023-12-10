import java.util.*;
class Program19
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       
       while(t-->0)
       {
        int k=sc.nextInt();
        int a[]=new int[k];
         int count=0;
        for(int i=0;i<k;i++)
        {
            a[i]=sc.nextInt();
        }
       
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }

        }
       System.out.println(count);
       }
        
    }
}