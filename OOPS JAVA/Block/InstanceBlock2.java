class A 
{
    int a,b;
    void show()
    {
     a=50;
     b=60;
     System.out.println("a: "+a+ " b: "+b);
    }

    A()
    {
        a=30;
        b=40;
        System.out.println("a: " +a+ " b: "+b);
    }

    {
        a=10;
        b=20;
        System.out.println("a: " +a+ " b: "+b);
    }
}
class InstanceBlock2
{
    public static void main(String args[])
    {
      A ref=new A();
      ref.show();
    }
}