class A
{
    int a;
    double b;
    String c;
    
    A() //----Default constructor-------
    {
        a=10;
        b=50.23;
        c="Ashish";
    }
    A(int x)  //--------parametrised constrctor-----
    {
        a=x;
    }
    A(double y,String z)  //--------parametrised constructor---
    {
        b=y;
        c=z;
    }

}
class OverLoading
{
    public static void main(String args[])
    {
        A ref1=new A();
        A ref2=new A(10);
        A ref3=new A(23.56,"Ashish");
        System.out.println(ref1.a+" "+ref1.b+" "+ref1.c);
        System.out.println(ref2.a);
        System.out.println(ref3.b+" "+ref3.c);

    }
}
