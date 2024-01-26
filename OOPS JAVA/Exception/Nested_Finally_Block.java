class Nested_Finally_Block
{
    public static void main(String args[])
    {
        try
        {
            String a="Ankit";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                System.out.println(10/0);
            }
            catch(ArithmeticException a)
            {
                System.out.println("can not divide by zero");
            }
            finally
            {
               System.out.println("Program successfully excuted");
            }
        }
        System.out.print("main method ended");
    }
}