//..........................CONVERSION BINARY TO OCTAL AND DECIMAL..........................//

import java.util.*;
class Binary_Octal
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binary=ref.nextInt();
        int decimal=0,octal=0,rem1,rem2;
        //.............................BINARY TO DECIMAL........................//
        for(int i=0;binary>0;i++)
        {
            rem1=binary%10;
            decimal=decimal+(rem1*(int)Math.pow(2,i));
            binary=binary/10;
        }
        System.out.println("Decimal: "+decimal);
        //.............................BINARY TO OCTAL.........................//
        for(int i=0;decimal>0;i++)
        {
            rem2=decimal%8;
            octal=octal+(rem2*((int)Math.pow(10,i)));
            decimal=decimal/8;
        }
        System.out.println("Octal: "+octal);

    }
}