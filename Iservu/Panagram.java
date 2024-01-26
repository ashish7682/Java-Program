import java.util.*;
class Panagram 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("\\s","");
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        char ch[]=new char[set.size()];
       
        boolean b=true;
        int j=0;
        for(char c:set)
        {
            ch[j++]=c;
        }
        
        
         // Iterator it=set.iterator();
        // while(it.hasNext())
        // {
        //     ch[j++]=(it.next()).charValue();
        // }
        
        
        Arrays.sort(ch);
        if(ch[0]!=97)
        {
            b=false;
        }
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]+1!=ch[i+1])
            {
               b=false;
               break;
            }
            
        }
        System.out.println(b);
        
    }
}