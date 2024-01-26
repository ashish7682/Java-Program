//All the sharing same method
class Myclass
{
    //method to calculate square value
    
        void calculate(double x)
        {
            System.out.println("Square="+(x*x));
        }
    
}
class Program3
{
    public static void main(String args[])
    {
        //Create 3 objects
        Myclass obj1=new Myclass();
        Myclass obj2=new Myclass();
        Myclass obj3=new Myclass();

        //call calculate() method from the subject
      obj1.calculate(3);
      obj2.calculate(5);
      obj3.calculate(7);


    }
}