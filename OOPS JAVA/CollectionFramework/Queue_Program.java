//...........................QUEUE PROGRAM........................
import java.util.*;
class Queue_Program 
{
    public static void main(String args[])
    {
        //...................Create Linked list as Queue...........
        Queue<Integer> q=new LinkedList<>();
       //Store integer from 1 to 5
        for(int i=1;i<=5;i++)
        {
          q.offer(i);
        }
        System.out.println("The Queue is: ");
        while(!q.isEmpty())
        {
            System.out.println(q.poll());
        }
    }
}