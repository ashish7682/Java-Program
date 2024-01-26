//-----------------------------HASH TABLE--------------------------------
import java.util.*;
import java.io.*;
class Hash_Table
{
    public static void main(String args[])
    {
        //.......................Synatx of Hashtable..................
        Hashtable<String,Integer> ht=new Hashtable<>();
        //.................... ...Entery(Input)The Element................
        ht.put("Ajay",50);
        ht.put("Sachin",77);
        ht.put("Gavaskar",44);
        ht.put("Kapil",60);
        ht.put("Dhoni",88);
        //.......................Print The Element.....................
        System.out.println(ht);
        //.....................print size of hash table....................
        System.out.println("Size: "+ht.size());
        //...................print value of player....................
        System.out.println(ht.get("Gavaskar"));
        //....................Remove element........................
        System.out.println(ht.remove("Kapil",54));//it return false as 54 does not value of kapil
        System.out.println(ht.remove("Kapil",60));//it return true as 60 does the value of kapil
        System.out.println(ht);
        //.......................clear All element........................
        ht.clear();
        System.out.println(ht);
        //.........................check hash table is empty or not.............
        System.out.println(ht.isEmpty());
    
    }
}