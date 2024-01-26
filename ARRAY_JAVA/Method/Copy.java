import java.util.Arrays;
import java.util.Scanner;
class Copy
{
    public static void main(String args[])
    {
        int a1[]=new int[5];int i;
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter data in Array1:");
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=ref.nextInt();
        }
        int a2[]=Arrays.copyof(a1,5);
        System.out.print("Data in Array2:");
      for(i=0;i<a2.length;i++)
      {
        System.out.print(a2[i]+" ");
      }
    }
}