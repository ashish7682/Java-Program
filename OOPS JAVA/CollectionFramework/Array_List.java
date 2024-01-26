import java.util.ArrayList;
import java.util.Collections;

class Array_List
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        //.....................Add Method(To Add Element)......................
        list.add(12);
        list.add(15);
        list.add(20);
        list.add(8);
        list.add(10);
        //.....................Print The List...............................
        System.out.println(list);
        //....Get Method(to find out the element which present at the index postion)....
        int element=list.get(2);
        System.out.println(element);
        //....................Add element in between the list...................
        list.set(0,20);
        System.out.println(list);
        //....................Delete element(but we write its postion) from the list......................
        list.remove(2);
        System.out.println(list);
        //...................To find out the Size of Arraylist...................
        int size=list.size();
        System.out.println(size);
        //...................Loop continue in list..................
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i)+" ");
        }
        //........................Sorting..............................
        Collections.sort(list);
        System.out.print(list);
    }
}