import java.util.*;
class BikeCrosser
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
        int count=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==0)
           {
             for(int j=i;j<a.length;j++)
             {
             if(a[j]==1)
             {
                count++;
             }
             }
           }
          
        }
        System.out.println(count);
    
    }
}