import java.util.*;
class Demo
{
    HashMap<Character,Integer>map=new HashMap<>();
    void print(String str,char x)
    { 
        char ch=0;
        int fre=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(map.containsKey(str.charAt(i)))
            {
                int count=map.get(str.charAt(i));
                map.put(str.charAt(i),++count);
            }
            else{
                map.put(str.charAt(i),1);
            }
            if(fre<map.get(str.charAt(i)))
            {
                fre=map.get(str.charAt(i));
                ch=str.charAt(i);
            }
        }
 
        String s1=str.replace(ch,x);
        System.out.println(s1);
        
    }
    public static void main(String args[])
    {
        Demo d=new Demo();
        d.print("bbadbbababb",'t');
    }
}