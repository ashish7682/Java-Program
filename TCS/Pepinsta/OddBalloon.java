import java.util.*;
class OddBalloon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // char ch[]=new char[n];

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=sc.next().charAt(0);
            if(map.containsKey(ch))
            {
                int count=map.get(ch);
                map.put(ch,count++); 
            }else
            {
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue()%2!=0)
            {
                System.out.println(e.getKey());
                break;
            }
        }

        
    }
}