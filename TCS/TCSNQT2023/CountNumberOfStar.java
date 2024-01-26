import java.util.*;
class CountNumberOfStar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                count1++;
            }else if(s.charAt(i)=='#')
            {
                count2++;
            }
        }
        int res=0;
        if(count1>=count2)
        {
            res=count1-count2;
        }else if(count1<count2)
        {
            res=count2-count1;
        }
        System.out.println(res);
    }
}