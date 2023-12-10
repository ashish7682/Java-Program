import java.util.*;
class Anagram
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toLowerCase();
        String b=sc.nextLine().toLowerCase();
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean c=(Arrays.equals(ch1,ch2));
        if(c==true)
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }

    }
}