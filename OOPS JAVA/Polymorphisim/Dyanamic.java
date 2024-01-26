// Dynamic Polymorphisim
class Sample
{
    void add(int a,int b)
    {
        System.out.println("Sum of two="+(a+b));
    }

    void add(int a,int b,int c)
    {
    System.out.println("Sum of three=" +(a+b+c));
    }
}

class Dyanamic
{
    public static void main(String args[])
    {
        // Create Sample class object
        Sample s=new Sample();
        //call add() and pass two values
        s.add(10,15);
        s.add(10,15,20);
    }
}