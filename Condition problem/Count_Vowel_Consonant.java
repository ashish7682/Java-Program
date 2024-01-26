import java.util.*;
class Count_Vowel_Consonant
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        int cCount=0,vCount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vCount++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
               cCount++; 
            }
        }
        System.out.println(cCount);
        System.out.println(vCount);
        
    }
}