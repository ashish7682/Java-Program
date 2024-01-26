import java.util.*;
class Octal_Binary
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter the Octal number: ");
        int octal=ref.nextInt();
        int decimal=0,binary=0,rem1,rem2;

        for(int i=0;octal>0;i++)
        {
            rem1=octal%10;
            decimal=decimal+(rem1*((int)Math.pow(8,i)));
            octal=octal/10;
        }
        System.out.println("Decimal: "+decimal);

        for(int i=0;decimal>0;i++)
        {
            rem2=decimal%2;
            binary=binary+(rem2*((int)Math.pow(10,i)));
            decimal=decimal/2;
        }
        System.out.print("Binary: "+binary);
    }
}