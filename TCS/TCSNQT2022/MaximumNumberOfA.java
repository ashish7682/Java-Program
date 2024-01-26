import java.util.*;
class MaximumNumberOfA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int max=0;
        for(int i=0;i<s.length()-n;i++)
        {
           int count=0;
           String s1=s.substring(i,i+n);
           for(int j=0;j<s1.length();j++)
           {
            if(s1.charAt(j)=='a')
            {
                count++;
            }
           }
           if(count>max)
           {
            max=count;
           }
        }
        System.out.print(max);
    }
}