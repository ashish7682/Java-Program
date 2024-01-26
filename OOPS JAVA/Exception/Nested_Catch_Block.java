class Nested_Catch_Block
{
    public static void main(String args[])
    {
        try
        {
            System.out.println(10/0);
        }catch(Exception e)
        {
            System.out.println(e);
            try
            {
            String a=null;
            System.out.println(a.toLowerCase());
            }
            catch(NullPointerException n)
            {
                System.out.println("Null value can not be converted");
            }
        }
        System.out.println("main method ended");
    }
}