//Reverse the number without using array index//
import java.util.Scanner;
class Reverse_Array
{
    public static void main(String args[])
    {
     int n;
     //Enter your choice
     System.out.print("Enter No. of term:");
     Scanner ref=new Scanner(System.in);
     n=ref.nextInt();
     int arr[]=new int[n];
     //Enter the value
     for(int i=0;i<=n-1;i++)
     {
        arr[i]=ref.nextInt();
     }
     System.out.println("Before reverse:");
     for(int i=0;i<=n-1;i++)
     {
        System.out.println(""+arr[i]);
     }
     System.out.println("After reverse:");
     for(int i=n-1;i>=0;i--)
     {
        System.out.println(""+arr[i]);
     }
    }
}