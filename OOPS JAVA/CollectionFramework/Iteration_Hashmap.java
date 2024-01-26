//......................ITERATION IN HASHMAP...........................
//----------Syntax-->Map.Entry<Integer,Integer>e:Map.entrySet()-------------
import java.util.*;
class Iteration_Hashmap
{
    public static void main(String args[])
    {
        //......................HashMap Syntax...............................
        HashMap<String , Integer> map=new HashMap<>();
        //...........First method  to print array element using For Loop................
       int arr[]={12,15,20};
       for(int i=0;i<3;i++)
       {
        System.out.print(arr[i]+" ");
       }
       System.out.println();
       //.............Second method to print array element using loop.............
       for(int val:arr)
       {
        System.out.print(val +" ");
       }
       System.out.println();
       //..................Third method to print array element with their value......
       map.put("India",120);
       map.put("US",50);
       map.put("China",150);
       for(Map.Entry<String,Integer> e :map.entrySet())
       {
        System.out.print(e.getKey()+" ");
        System.out.println(e.getValue());
       }
       //......................To Print all Key Element.............................
       Set<String> keys=map.keySet();
       for(String key:keys)
       {
        System.out.println(key+" "+map.get(key));
       }
       //.....................
    }
}