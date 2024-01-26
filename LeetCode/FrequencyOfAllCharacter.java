import java.util.*;
class FrequencyOfAllCharacter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int count=map.get(s.charAt(i));
                map.put(s.charAt(i),++count);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        int x=map.get(s.charAt(0));
        boolean b=true;
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue()!=x)
            {
                b=false;
                break;
            }
        }
        System.out.println(b);
    }
}
// Example 1:

// Input: s = "abacbc"
// Output: true
// Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
// Example 2:

// Input: s = "aaabb"
// Output: false
// Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 