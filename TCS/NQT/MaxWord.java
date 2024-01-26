import java.util.*;
class MaxWord
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        int max=0;
        for(int i=0;i<words.length;i++)
        {
            max=Math.max(max,words[i].length());
        }
        System.out.println(max);
    }
}