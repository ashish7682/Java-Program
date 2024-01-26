//...............................VECTOR CLASS...............................
import java.util.Vector;
import java.util.*;
class Vector_Method
{
    public static void main(String args[])
    {
    Vector<Integer> v=new Vector<>();
    //................Add Method................
    v.add(45);
    v.add(60);
    v.add(65);
    v.add(30);
    v.add(50);
    //...............Print Add Element..........
    System.out.println(v);
    //..................Adding element At Any Index................
    v.add(2,50);
    System.out.println(v);
    //.................Find elment at from a particular position..........
    System.out.println(v.get(1));
    //..................Print index number of element...............
    System.out.println(v.indexOf(65));//----------------If element present it return its postion
    System.out.println(v.indexOf(100));//---------------if element not present it return -1 value
    //..................Print all element Squencially....................
    System.out.println("Print the element in squencially:");
    ListIterator v1=v.listIterator();
    while(v1.hasNext())
    {
        System.out.print(v1.next()+"\t");
    }

    //..................Print the element in reverse order.....................
    System.out.println();
    System.out.println("Print all element in reverse order:");
    while(v1.hasPrevious())
    {
        System.out.print(v1.previous()+"\t");
    }
    System.out.println();
    //..............Size of Vetcor.................
    System.out.println("Size: "+v.size());
    //..............Capacity of vector..............
    System.out.println("Capacity: "+v.capacity());
    //..............Remove an elment from a particular index................
    v.removeElementAt(2);
    System.out.println(v);
    //....................Clear All Element..................
    v.clear();
    System.out.println(v);

    }
 
}