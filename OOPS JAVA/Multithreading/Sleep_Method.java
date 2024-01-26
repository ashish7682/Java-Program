//import java.util.*;
class A extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++);
            {
                System.out.println("Ashish");
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e)
        {
           System.out.println("Interrupted Exception");
        }
    }
}

class Sleep_Method
{
    public static void main(String args[]) throws InterruptedException
    {
        A t=new A();
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println("Ankush");
            Thread.sleep(1000);
        }
    }
}