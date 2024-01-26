//------------*NULLPOINTER EXCEPTION*------------//

class NullPointer
{
    public static void main(String args[])
    {
        String str=null;
        System.out.println(str);
        //System.out.println(str.toUpperCase());
        //we can not direct convert null to uppercase it show nullpointer exception
        try{
            System.out.println(str.toUpperCase());
        }catch(NullPointerException n)
        {
            System.out.println(n);
            System.out.println("null can not be casted");
        }
    }
}