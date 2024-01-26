import java.util.Scanner;
class  Ascending
{
    public static void main(String args[])
    {
        int n,temp;
        System.out.print("Enter No. of Term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=ref.nextInt();
        }
        System.out.println("Before Ascending order:");
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("arr["+i+"]="+arr[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After Ascending Order:");
            for(int i=0;i<=n-1;i++)
            {
                System.out.println("arr["+i+"]="+arr[i]);
            }
        }
}


