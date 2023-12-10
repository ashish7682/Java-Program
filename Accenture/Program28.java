import java.util.*;
class Program28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        double a=sc.nextDouble();
        System.out.println("Enter value of b: ");
        double b=sc.nextDouble();
        System.out.println("Enter value of c: ");
        double c=sc.nextDouble();
        double d=b*b-4.0*a*c;
        if(d>0.0)
        {
            double r1=(-b+Math.pow(d,0.5))/(2.0*a);
            double r2=(-b-Math.pow(d,0.5))/(2.0*a);
            System.out.println("The roots are " +r1+ "and" +r2); 
        }
        else if(d==0.0)
        {
            double r1=-b/(2.0*a);
            double r2=-b/(2.0*a);
            System.out.println("The roots are " +r1+ " and "+r2);
        }
        else
        {
               double r1 = -b / (2 * a);
               double r2 = Math.sqrt(-d) / (2 * a);
               System.out.format("root1 = %.2f+%.2fi", r1, r2);
               System.out.format("\nroot2 = %.2f-%.2fi", r1, r2);


        }
    }
}