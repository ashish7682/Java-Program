class One 
{
    //method calculate square value
    void calculate(double x)
    {
        System.out.println("Sqaure value="+(x*x));
    }
}
class Two extends One
{
    void calculate(double x)
    {
        super.calculate(10);
        System.out.println("Square root="+Math.sqrt(x));
    }
}
class Overriden
{
    public static void main(String args[])
    {
        Two t=new Two();
        t.calculate(25);
    }
}