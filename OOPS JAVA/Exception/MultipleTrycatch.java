//--------------------*MULTIPLE TRY_CATCH*-------------------//

class MultipleTrycatch
{
    public static void main(String args[])
    {
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a)
        {
            //System.out.println(a);
            System.out.println("can not divide by zero");
        }
        try
        {
         int a[]={10,20,30,40,50};
         System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException b)
        {
       // System.out.println(b);
        System.out.println("Beyond the array limit");
        }
    }
}