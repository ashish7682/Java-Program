class A 
{
    int a;
    String b;
    A()         //---------Default constructor--------
    {
        a=10;
        b="LearnCoding";
    }
    A(A ref1)      //---------Parametrised Constructor-------
    {
        a=ref1.a;
        b=ref1.b;
        System.out.println(a +" " +b);
    }
}
class CopyConstructor
{
 public static void main(String args[])
 {
    A ref1=new A();
    A ref2=new A(ref1);
 }
}