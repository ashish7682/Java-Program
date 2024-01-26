import java.util.*;
class Octal_Decimal
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter the Ocatl number: ");
        int octal=ref.nextInt();
        int decimal=0,rem;
        for(int i=0;octal>0;i++)
        {
            rem=octal%10;
            decimal=decimal+((int)Math.pow(8,i)*rem);
            octal=octal/10;
        }
        System.out.print("Decimal: "+decimal);


    }
}