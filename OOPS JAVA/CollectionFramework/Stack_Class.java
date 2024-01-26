//..........................STACK CLASS...............................
import java.util.*;
import java.io.*;
class Stack_Class
{
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<>();
        //...............Push Method..............
        st.push(5);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(25);
        st.push(12);
        //..............Print the Number..........
        System.out.println(st);
        //..............Pop Method(Delete Purpose)........
        Integer obj=st.pop();
        System.out.println(st);
        /*..............Peek Method(This method says which element present at
                               the topmost of the stack).........*/
        System.out.println(st.peek());
        //................Check Stack is empty or not...............
        if(!st.empty())
        {
            System.out.println("Stack is not empty");
        }
        else
        {
            System.out.println("Stack is empty");
        }
        /*.............Searching Element(if element present returns its
             position or index,but if element not present it returns -1)...............*/
        System.out.println(st.search(12));//Return its position
        System.out.println(st.search(55));//Return it -1

    }
}