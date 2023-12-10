import java.util.*;
class Program25
{
    void array(int a[])
    {
        String s="";
        for(int i=0;i<a.length-1;i++)
        {
            s=s+a[i];
        }
        int b[]=new int[s.length()];
        for(int i=0;i<b.length;i++)
        {
            b[i]=Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(b);
        for(int i=b.length-1;i>=0;i--)
        {
           System.out.print(b[i]);
        }
    }
    public static void main(String args[])
    {
        int a[]={34,79,58,64};
        Program25 ref=new Program25();
        ref.array(a);

    }
}