public class PrintNumber_5to1
{
    public static void Print(int n)
    {
        if(n==0)
        {
            return;
        }else{
        System.out.println(n);
        Print(n-1);
        }
    }
    public static void main(String args[])
    {
        int n=5;
        Print(n);
    }
}