import java.util.*;
class SumTwist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SumTwist obj=new SumTwist();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        obj.sum(a,b);
    }
    void sum(double a,double b)
    {
        double add=0;
        add=a+b;
        System.out.println("Sum ="+add);
    }
}