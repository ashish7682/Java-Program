import java.util.*;
import java.io.*;

class Demo extends Thread
{
    private volatile boolean exit=false;

    public void Demo()
    {
        exit=true;
    } 


@Override
public void Run()
{
while(!exit)
{
System.out.println("Thread is running.....");
}
System.out.println("Thread is stopped.......");
}
}

public class StopThread
{
    public static void main(String args[])
    {
        Demo thread=new Demo();
        thread.start();

        try
        {
            Thread.sleep(10);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        thread.stopThread();
    }
}