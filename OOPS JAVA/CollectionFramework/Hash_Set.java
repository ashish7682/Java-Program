//.............................HASH SET...............................
import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
class Hash_Set
{
    public static void main(String args[])
    {
        HashSet<Integer> hash=new HashSet<>();
        //.................Add method.................
        hash.add(5);
        hash.add(6);
        hash.add(8);
        hash.add(15);
        hash.add(25);
        hash.add(15);
        //.............Print...................
        System.out.println(hash);
        //..........size of total HashSet.............
        System.out.println("size of hashset:"+hash.size());
        //...........Search Contains-----Example(1)..........
        if(hash.contains(50))
        {
            System.out.println("Hash contain 50");
        }
        else
        {
            System.out.println("Hash does not contain 50");
        }
        //............Search Conatins-------Example(2).........
        if(hash.contains(25))
        {
            System.out.println("hash Conatains 25");
        }
        else
        {
            System.out.println("Hash does not Contains 25");
        }
        //..........Delete Method.......... 
        hash.remove(25);
        System.out.println(hash);
        //...........iterator method...........
        System.out.println("Element Using iterator:");
        Iterator it=hash.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //.........Remove all the element from hashset.......
        hash.clear();
        System.out.println(hash);
        //.........check hash is empty or not..........
        if(hash.isEmpty())
        {
            System.out.println("Yes hash is empty");
        }else
        {
            System.out.println("No hash is not empty");
        }


    }
}