//......................................IS ALIVE METHOD(IN JAVA)............................
class A extends Thread
{
    public void run()
    {
        System.out.println("Is Alive Method program");
    }
}

class IS_Alive_Method
{
    public static void main(String args[])
    {
       A t1=new A();
       A t2=new A();
       //........................If we apply IsAlive method before start method it will show (false)............. 
       System.out.println(t1.isAlive());

       t1.start();
       //.....................If we will apply IsAlive method after start method it will show(true).............
       System.out.println(t1.isAlive());

       t2.start();
    }
}