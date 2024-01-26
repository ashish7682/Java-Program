class Shape
{
    void draw()
    {
        System.out.println("Can not say Shape type");
    }
}
class Square extends Shape
{
   // @Override
    void draw()
    {
        System.out.println("Square Shape");
    }
}

class MethodOverriding
{
    public static void main(String args[])
    {
        Shape ref=new Square();
        ref.draw(); 
    }
}