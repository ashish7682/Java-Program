//-------------------NESTED TRY BLOCK--------------------//
class NestedTryBlock
{
public static void main(String args[])
{

try
 {
    try
    {
        int a[]={10,20,30};
        System.out.println(a[5]);
    }
    catch(ArrayIndexOutOfBoundsException a)
    {
        System.out.println("Array exception");
    }
    System.out.println(10/0);
 }
 catch(ArithmeticException e)
 {
    System.out.println(e);
 }
 System.out.println("learn coding");
}
    }
 