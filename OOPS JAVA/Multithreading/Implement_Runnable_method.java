//..................Implement Runnable Interface....................
class A implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("My child Thread");
        }
    }
}

class Implement_Runnable_method
{
    public static void main(String args[])
    {
        A r=new A();
        Thread t=new Thread(r);
        t.start();
        //.................t Thread started from this line..................
        for(int i=1;i<=5;i++)
        {
            System.out.println("My main Thread");
        }
    }
}