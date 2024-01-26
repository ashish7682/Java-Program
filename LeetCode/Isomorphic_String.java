import java.util.*;
class Isomorphic_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        boolean b=true;

        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                {
                    b=false;
                }
            }else
            {
                if(map.containsKey(t.charAt(i)))
                {
                    b=false;
                }
            }
            map.put(s.charAt(i),t.charAt(i));
        }
       
       System.out.println(b);
    }
}