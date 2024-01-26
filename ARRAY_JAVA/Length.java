                         //FIND LENGTH OF ARRAY ELEMENT//
import java.util.Scanner;
class Length
{
    public static void main(String args[])
    {
        int n,i;
        System.out.print("Enter Nmber of term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int arr[]=new int[n];
        for( i=0;i<=n-1;i++)
        {
            arr[i]=ref.nextInt();
        }
        for(i=0;i<=n-1;i++)
        {
            System.out.println("arr["+i+"]=" +arr[i]);
        }
        System.out.print("Array length="+arr.length);
    }
}
