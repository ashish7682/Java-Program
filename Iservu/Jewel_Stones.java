import java.util.*;
class Jewel_Stones
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();


        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
}