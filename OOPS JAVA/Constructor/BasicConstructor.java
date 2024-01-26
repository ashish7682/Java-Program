class A
{
    int a;
    String name;
    A()
    {
        a=0;
        name=null;
    }
        void Show()
        {
            System.out.println("a= "+a);
            System.out.println("Name= "+name);
        }
}

class BasicConstructor
{
    public static void main(String args[] )
    {
    A ref=new A();
    ref.Show();
    }
}
