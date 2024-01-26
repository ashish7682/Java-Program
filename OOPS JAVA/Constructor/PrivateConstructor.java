class PrivateConstructor
{
    int a;
    double b;
    String c;
    private PrivateConstructor()  //--------Create private constructor------
    {
        a=10;
        b=30.56;
        c="Ashish";
        System.out.println("a : " +a);
        System.out.println("b : " +b);
        System.out.println("c : " +c);
    }
    public static void main(String args[])
    {
        PrivateConstructor ref=new PrivateConstructor();
    }
}