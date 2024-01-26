import java.util.*;
class LongestWord_Length
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i].length();
        }
        Arrays.sort(b);
        int result=b[a.length-1];
        System.out.println(result);
    }
}