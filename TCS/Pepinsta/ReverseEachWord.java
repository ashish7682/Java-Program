import java.util.*;
class  ReverseEachWord
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String words[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        String display="";
        for(String word:words)
        {
            StringBuilder temp=new StringBuilder(word);
            temp.reverse();
            result.append(temp);
            result.append(" ");
            display=result.toString().trim();
        }
        System.out.println(display);
    }
}