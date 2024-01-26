class Throw_Vs_Throws
{
    void div(int a,int b)
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }else{
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String args[])
    {
        Throw_Vs_Throws t=new Throw_Vs_Throws();
        try
        {
         t.div(20,0);
        }
        catch(Exception e)
        {
            System.out.println("The value of b is zero");
        }
    }
}
