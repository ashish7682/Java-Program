import java.util.*;
class Thread_use_JVM
{
    public static void main(String args[])
    {
        System.out.println("Let us find current thread");
        Thread t=Thread.currentThread();
        System.out.println("Curent thread= "+t);
        System.out.println("Its name= "+t.getName());
    }
}