import java.util.*;
class Migratory_Bird
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if (map.containsKey(a[i]))
            {
                int count=map.get(a[i]);
                map.put(a[i],++count);
            }else
            {
                map.put(a[i],1);
            }
        }
        int num=0,max=0;
       for(Map.Entry<Integer,Integer> e:map.entrySet()) 
        {
            
            if(e.getValue()>max)
            {
                 max=e.getValue();
                 num=e.getKey();
            }else if(max==e.getValue())
            {
                if(num>e.getKey())
                {
                    num=e.getKey();
                }
            }
        }
        System.out.println(num);
    }
}