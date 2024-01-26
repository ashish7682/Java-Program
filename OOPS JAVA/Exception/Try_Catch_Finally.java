class Try_Catch_Finally
{
    public static void main(String args[])
   {
    try
    {
          System.out.println("Entry in try block");
          int a=10,b=2,c;
          c=a/b;
          System.out.println(c);
        
    }
    catch(ArithmeticException a)
    {
     System.out.println("can not divide by zero.");
    }
    finally
    {
     System.out.println("Sucessfully excuted");
    }
    System.out.println("main method ended");
  }
}