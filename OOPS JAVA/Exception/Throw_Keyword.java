class Throw_Keyword
{
    public static void main(String args[])
    {
        System.out.println(10/0);
        throw new ArithmeticException("Any number can not divide by zero");
    }
}