import java.util.*;
class OddBalloon2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Character,Integer> map=new HashMap<>();
        char ch[]=new char[n];
        for(int i=0;i<n;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        for(int i=0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]))
            {
                int count=map.get(ch[i]);
                map.put(ch[i],++count);
            }else
            {
                map.put(ch[i],1);
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