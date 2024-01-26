interface Gill 
{
    void Add();
}
interface Raj extends Gill
{
   //void Add();
    void sub();
}
class Ankit implements Raj 
{
    @Override
    public void Add()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("Addtion: "+c);
    }

       @Override
        public void sub()
        {
            int a=20,b=10,c;
            c=a-b;
            System.out.println("Subtraction: "+c);
        }
}

class Extending_Interface
{
    public static void main(String args[])
    {
        Raj r=new Ankit();
        r.Add();
        r.sub();
    }
}