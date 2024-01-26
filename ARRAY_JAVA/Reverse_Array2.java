//Reverse the array element using array index
import java.util.Scanner;
class Reverse_Array2
{
    public static void main(String args[])
    {
        int n,temp,i;
        System.out.print("Enter Nmber of term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int arr[]=new int[n];
        for( i=0;i<=n-1;i++)
        {
            arr[i]=ref.nextInt();
        }
        System.out.println("Before reverse:");
        for(i=0;i<=n-1;i++)
        {
            System.out.println("arr["+i+"]=" +arr[i]);
        }
        for( i=0;i<n/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("After reverse:");
        for( i=0;i<=n-1;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }

    }
}