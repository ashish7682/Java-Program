//---------------------*Multiple Catch Block*---------------------//

class MultipleCatchBlock
{
    public static void main(String args[])
    {
        try
        {
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int arr[]={10,20,30};
            System.out.println(arr[0]);

            String str=null;
            //String str="ankit";
            System.out.println(str.toUpperCase());
        }
//Each exception are depend upon other output//
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array Exception");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithematic Exception");
        }
        catch(NumberFormatException n)
        {
            System.out.println("Number Exception");
        }
        catch(Exception x)
        {
            System.out.println("All type of Exception are handled");
        }
    }
}
//one exception is depend upon other