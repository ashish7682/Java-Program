interface A 
{
    void show();
}
interface B
{
    void disp();
}
class Multiple_Inheritance2
{
    public void show()
    {
        System.out.println("Interface A");
    }
    public void disp()
    {
        System.out.println("Interface B");
    }
    public static void main(String args[])
    {
      Multiple_Inheritance2 m=new Multiple_Inheritance2();
      m.show();
      m.disp();
    }
}