import java.util.*;

    class Demo extends Thread
 {
    public void run()
    {
      for(int i=1;i<=10;i++)
      {
        System.out.println(i);
      }
    }
 }


class Mythread_Run
{
    public static void main(String args[])
    {
        Demo obj=new Demo();
        Thread t=new Thread(obj);
        t.start();
    }
}