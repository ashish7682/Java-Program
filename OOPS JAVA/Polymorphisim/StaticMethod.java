class One
{
  static void calculate(double x)
  {
    System.out.println("Square value="+(x*x));
  }
}

class Two extends One
{
static void calculate(double x)
{
    System.out.println("Square root="+Math.sqrt(x));
}
}
class StaticMethod
{
    public static void main(String args[])
    {
     One O=new Two();
     O.calculate(25);
    }
}
