import java.util.*;

class Demo extends Thread
{
    public void run()
    {
        String n=Thread.currentThread().getName();
        try
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException i)
        {
            System.out.println("Interrupted Exception");
        }
    }
}

class Sleep_Method3
{
    public static void main(String args[])
    {
        Demo t1=new Demo();
        Demo t2=new Demo();
        Demo t3=new Demo();

        t1.setName("thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}