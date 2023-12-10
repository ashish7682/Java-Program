import java.util.*;
class Program20
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
            for(int i=0;i<k-1;i++)
            {
               int min=i;
                for(int j=i+1;j<k;j++)
                {
                    if(a[min]>a[j])
                    {
                        min=j;
                    }

                }
                if(min!=i)
                {
                    int temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}