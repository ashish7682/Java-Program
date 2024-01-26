class A 
{
    int a,b;
    A()
    {
        a=30;
        b=40;
        System.out.println("a: " +a+ " b: " +b);
    }

    {
        a=10;
        b=20;
        System.out.println("a: " +a+ " b: "+b);
    }
}
class InstanceBlock
{
    public static void main(String args[])
    {
        A ref=new A();
    }
}