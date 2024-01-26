import java.util.*;
class Binary_Decimal
{
    public static void main(String args[])
    {
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        int Binary=ref.nextInt();
        int Decimal=0,rem,i=0;
       while(Binary!=0);
        {
            rem=Binary%10;
            Decimal=Decimal+rem*(int)(Math.pow(2,i));
            i++;
            Binary=Binary/10;
            
        }
        // Decimal=Decimal+rem*(int)(Math.pow(2,i));
       // rem=Binary%10;
       /*for(int i=0;Binary>0;i++)
       {
            rem=Binary%10;
            Decimal=Decimal+rem*(int)(Math.pow(2,i));
            Binary=Binary/10;
        
       }*/
        System.out.println("Decimal: "+Decimal);
    }
}