//display a binary number system in other number system
class Conversion
{
    public static void main(String args[])
    {
        int num=0b1010; // Binary
        System.out.printf("\n In decimal=%d",num);
        System.out.printf("\n In Octal=%o",num);
        System.out.printf("\n In Hexadecimal=%x",num);
       System.out.printf("\n In Binary=%s",Integer.toBinaryString(num));
    }
}