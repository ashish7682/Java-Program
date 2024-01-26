import java.util.*;
class Reverse_Word
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words)
        {
            StringBuilder temp=new StringBuilder(word);
            temp.reverse();
            result.append(temp);
            result.append(" ");
        }
        String s2=result.toString().trim();
        System.out.println(s2);

    }
}
// Input: s = "God Ding"
// Output: "doG gniD"
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
