                      //ADDTION OF ARRAY ELEMENT//
import java.util.Scanner;
class Addition
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        System.out.print("Enter number of term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int arr[]=new int[n];
        for(i=0;i<=n-1;i++)
        {
            arr[i]=ref.nextInt();
        }
        System.out.println("Array Element:");
        for(i=0;i<=n-1;i++)
        {
            System.out.println(""+arr[i]);
        }
        System.out.print("Addition Result=");
        for(i=0;i<=n-1;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print(""+sum);
    }
}