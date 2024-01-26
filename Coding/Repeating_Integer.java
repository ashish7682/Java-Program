import java.util.*;
class Repeating_Integer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        HashMap<Character,Integer> map=new HashMap<>();
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
        int count=0;
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue()>1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}