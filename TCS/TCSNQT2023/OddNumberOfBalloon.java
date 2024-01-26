import java.util.*;
class OddNumberOfBalloon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch[]=new char[n];
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]))
            {
                int count=map.get(ch[i]);
                map.put(ch[i],++count);
            }else{
                map.put(ch[i],1);
            }
        }
        char ch1='\0';
        // for(int x:map.values())
        // {
        //     if(x % 2!=0)
        //     {
        //         map.getKey(x);
        //     }
        // }
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue() % 2 !=0)
            {
                ch1=e.getKey();
                break;
            }
        }
        System.out.println(ch1);
    }
}

/*map.get()----->In map.get() we have find only value if we pass key on it but the converse is not necessary ture.
for iterative in hashmap use use
for(Map.Entry<datatype,datatype> e:map.entrySet())
{
    e.getKey()---->print the keys
    e.getValues()---->print the values
}*/