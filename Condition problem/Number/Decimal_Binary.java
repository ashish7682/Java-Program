import java.util.*;
class Decimal_Binary
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int decimal=ref.nextInt();
        int binary=0,octal=0,rem1,rem2;
        for(int i=0;decimal>0;i++)
        {
            rem1=decimal%2;
            binary=binary+ (rem1*((int)Math.pow(10,i)));
            decimal=deciaml/2;
        }
        System.out.print("Binary: "+binary);
        for(int i=0;decimal>0;i++)
        {
            rem2=decimal%8;
            ocatl=octal+(rem2*(int)Math.pow(10,i));
            decimal=decimal/2;
        }
    }
}