import java.util.*;
class Program18
{
    void array(int a[],int k)
    {
        Arrays.sort(a);
        int result=a[(a.length-1)-k];
        System.out.println(result);
        
    }
    public static void main(String args[])
    {
       int a[]={74,85,102,99,101,56,84};
       int k=2;
       Program18 ref=new Program18();
       ref.array(a,k);
    }
}