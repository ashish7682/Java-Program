import java.util.*;
class Minimum_Distance_Between_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.next();
        }
        String s1=sc.next();
        String s2=sc.next();
        
        int d1=-1,d2=-1;
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<s.length;i++)
        {
            if(s1.equals(s[i]))
            {
                d1=i;
            }
            if(s2.equals(s[i]))
            {
                d2=i;
            }
            if(d1!=-1 && d2!=-1)
            {
                ans=Math.min(ans,Math.abs(d1-d2));
            }
        }
        System.out.println(ans);
    }
}