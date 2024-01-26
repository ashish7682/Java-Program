import java.util.*;
import java.io.*;
class A extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("t1 Thread running");
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("t1 thread terminated...!");
            Thread.sleep(1000);
        }
    }
}

class Interrupted_Method
{
    public static void main(String args[])
    {
        A t1=new A();
        t1.start();
        t1.interrupt();
    }
}