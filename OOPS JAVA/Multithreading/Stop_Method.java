//..................................STOP METHOD(IN JAVA)..............................

class A extends Thread
{
    public void run()
    {
        //..................this is will  provided name of current thread..................
        String name=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(name);
        }
    }
}
//.......................Main Method.....................
class Stop_Method
{
    public static void main(String args[])
    {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("t1 Thread");
        t2.setName("t2 Thread");
        t3.setName("t3 Thread");
    //....................Start method...................
        t1.start();
        t2.start();
        t3.start();
     //.......................Stop method....................
      t2.stop();

    }
}