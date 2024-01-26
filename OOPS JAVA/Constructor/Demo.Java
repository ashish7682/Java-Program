class Demo
{
    int a;
    double b;
    String c;
    private A()     //---------private constructor-------
    {
        a=10;
        b=30.56;
        c="Ankit";
        System.out.println(a + " " +c);
    }
    public static void main(String args[])
    {
        Demo ref=new Demo();
    }
    
}