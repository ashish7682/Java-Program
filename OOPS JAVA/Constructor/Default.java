 /*-----------------Default Constructor---------------*/
class A 
{
    int a;
    String b;
    boolean c;     //datatype and variable
    A()            //use Constructor
    {
        a=1000;
        b="Ankit";
        c=true;
    }
    void Display()
    {
        System.out.print("a: " +a + "b: " +b + "c: " +c);
    }
}
class Default
{
    public static void main(String args[])
    {
        A ref=new A();
        ref.Display();
    }
}