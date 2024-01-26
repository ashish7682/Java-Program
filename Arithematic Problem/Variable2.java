class Variable2
{
    static int a=10;
    void fun()
    {
        int b=10;
        System.out.println(a+" "+b);
        ++a;
        ++b;
    }
    public static void main(String args[])
    {
        Variable2 r=new Variable2();   
        r.fun();
        r.fun();
    }
}