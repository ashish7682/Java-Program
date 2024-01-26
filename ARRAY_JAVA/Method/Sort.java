import java.util.Scanner;
import java.util.Arrays;
class Sort
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter data in Arrays:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=ref.nextInt();
        }
        System.out.print("Data in Arrays:");
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}