import java.util.Scanner;
import java.util.Arrays;
class Equal
{
    public static void main(String args[])
    {
    int a1[]=new int[5];
    int a2[]=new int[8];
    Scanner ref=new Scanner(System.in);
    System.out.print("Enter the data in arrays:");
    for(int i=0;i<a1.length;i++)
    {
        a1[i]=ref.nextInt();
    }
    System.out.print("Enter Data in Arrays 2:");
    for(int i=0;i<a2.length;i++)
    {
        a2[i]=ref.nextInt();
    }
    boolean b=Arrays.equals(a1,a2);
    System.out.print("Is two Arrays are euals:"+b);
    }
}