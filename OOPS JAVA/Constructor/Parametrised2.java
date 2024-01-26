class A 
{
    int x,y;
    A(int a,int b)
    {
        x=a;y=b;
    }
    A(int a,String b)
    {
        System.out.println(a+ " " +b);
    }
    void show()
    {
        System.out.println(x + " " + y);
    }
}
class Parametrised2
{
    public static void main(String args[])
    {
        A ref1=new A(100,200);
        ref1.show();
        A ref2=new A(10,"Ankit");

    }
}