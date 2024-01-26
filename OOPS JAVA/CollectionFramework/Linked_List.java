import java.util.*;
class Linked_List
{
    public static void main(String args[])
    {
        LinkedList<Integer> li=new LinkedList<>();
        //....................Boolean Add...........................
        if(li.add(345))
        {
            System.out.println("Sucessfully Added");
        }
        
        //.....................Add Method..........................
        li.add(45);
        li.add(20);
        li.add(75);
        li.add(11);
        li.add(23);

        //......................Print.......................
        System.out.println(li);

        //...................Add at a specific postion...........
        li.add(4,75);
        System.out.println(li);

        //....................Add Element at first Index...................
        li.addFirst(55);
        System.out.println(li);

        //.................... Add Element at last Index..................
        li.addLast(100);
        System.out.println(li);

        //....................Remove Element at Any postion...............

        li.remove(2);//-------Remove the element at 2nd index postion ------
        System.out.println(li);

        //....................Get position of an Element.......................
        System.out.println(li.get(2));

        //....................Get First postion of an element............
        System.out.println(li.getFirst());

        //....................Get Last postion of an element............
        System.out.println(li.getLast());

        //....................Replace of an element from its positon.....
        li.set(2,150);
        System.out.println(li);

        //................Size of Linked List...............
        System.out.println(li.size());

        //................To find a number's index or postion.............
        System.out.println(li.indexOf(150));
        System.out.println(li.indexOf(1000));


    }
}