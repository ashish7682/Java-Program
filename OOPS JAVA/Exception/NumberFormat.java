//--------------------*NUMBER_FORMAT_EXCEPTION*---------------------//

class NumberFormat
{
    public static void main(String args[])
    {
        String str="ankit";
        //String str=123;----------->Show ouput as 123.
        try{
            int a=Integer.parseInt(str);
             System.out.println(a);
           System.out.println("String NumberFormatException");
        }
        catch(NumberFormatException n)
        {
           
        System.out.println("string "+str+" can not be converted to integer.");
        }
        System.out.println("Main method ended");
    }
}