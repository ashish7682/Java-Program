//-----------------Widening using referenced data types-----------------------
class One
{
    void show1()
    {
        System.out.println("Super class method");
    }
}
class Two extends One
{
    void show2()
    {
        System.out.println("Sub class method");
    }
}

class Widening
{
    public static void main(String args[])
    {
        One o;//---------O is the super class reference-------
        o=(One)new Two();//----------o is referring to sub class object-----
        o.show1();
    }
}