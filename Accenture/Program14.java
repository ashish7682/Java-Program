import java.util.*;
class Program14
{
   HashMap<Character,Integer>map=new HashMap<>();
   void print(String s,char x)
   {
    char ch=0;
    int frequency=0;
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
      if(frequency<map.get(s.charAt(i)))
      {
        frequency=map.get(s.charAt(i));
        ch=s.charAt(i);
      }
    }
    String s1=s.replace(ch,x);
    System.out.print(s1);
   }
    public static void main(String args[])
    {
        Program14 ref=new Program14();
        ref.print("bbadbbababb",'t');
    }

   
}