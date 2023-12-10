import java.util.*;
class Program17
{
     void array(int a[],int b[])
    {
        int c[]=new int[(a.length+b.length)];
        for(int i=0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else
            {
                c[i]=b[i-a.length];
            }
        }
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,6};
        int b[]={4,5,7};
        Program17 ref=new Program17();
        ref.array(a,b);


    }
}