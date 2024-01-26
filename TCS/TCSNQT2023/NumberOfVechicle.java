import java.util.*;
class NumberOfVechicle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int W=sc.nextInt();
        int TW=((4 *V)-W)/2;
        int FW=V-TW;
        if(W>=2 && (W % 2==0) && V < W)
        {
            System.out.println("TW: "+TW + " And " +"FW: " +FW);
        }else
        {
            System.out.println("Invalid Input");
        }
    }
}