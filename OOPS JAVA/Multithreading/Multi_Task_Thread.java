class MyThread implements Runnable
{
   String str;
   MyThread(String str)
   {
    this.str=str;
   }

   public void run()
   {
    for(int i=0;i<=10;i++)
    {
        System.out.println(str+" :"+i);

        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException ie)
        {

//.................We can use   printStackTrace() ---> for print the exception handle by catch block...........
            System.out.print("Interrupted Exception");
        }
    }
   }//.................End of run...................
}

class Multi_Task_Thread
{
    public static void main(String args[])
    {
        MyThread obj1=new MyThread("Cut the Ticket:");
        MyThread obj2=new MyThread("Show the Ticket:");
    //.................Craete Two Thread and attach them to the two Object..................
       Thread t1=new Thread(obj1);
       Thread t2=new Thread(obj2);
     //.................Start The Thread....................
       t1.start();
       t2.start();
    }
}