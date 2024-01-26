import java.util.Scanner;
class Average
{
public static void main(String args[])
{
    int n,sum=0;
    System.out.print("Enter the No. of term:");
    Scanner ref=new Scanner(System.in);
    n=ref.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
     arr[i]=ref.nextInt();
    }
       for(int i=0;i<=n-1;i++)
    {
        sum=sum+arr[i];
    }
   int  Average=sum/n;
   System.out.print("Average="+Average);
}
}