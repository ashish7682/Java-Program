//.............................To create a thread and run it, then stop it............................
import java.util.*;
import java.io.*;

class Demo extends Thread
 {
  boolean stop=false;

  public void run()
  {
    for(int i=0;i<=20;i++)
    {
        System.out.print(i+" ");
        //.........come out of Run........
        if(stop)  return;
    }
  }
}

class mythread_Run_Stop
{
    public static void main(String args[])
    {
        Demo obj=new Demo();
        Thread t=new Thread();
        t.start();
        //...............Stop the thread when enter the key......................
        
        //.......Wait till enter key pressed...........
        System.in.read();
        obj.stop=true;
    }
}