class A extends Thread
{
    public void run()
    {
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}

class Join_Method
{
    public static void main(String args[])
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t2.start();
        try
        {
            t2.join();
        }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted Exception");
        }
        t1.start();
        t3.start();

        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}