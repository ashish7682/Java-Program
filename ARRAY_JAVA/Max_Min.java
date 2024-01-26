import java.util.Scanner;
class Max_Min
{
    public static void main(String args[])
    {
        int n,temp;
        System.out.print("Enter the No. of term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=ref.nextInt();
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
            int count1=0;
            for(int i=0;i<n;i++)
            {
                if(arr[0]==arr[i])
                {
                    count1++;
                }
            }
           int count2=0;
            for(int i=n-1;i>=0;i--)
            {
                if(arr[n-1]==arr[i])
                {
                    count2++;
                }
            }
            System.out.println("Minimum Number:"+arr[0]);
            System.out.println("Maximum Number:"+arr[n-1]);
            System.out.println("No. of times  minimum number repeat:"+count1);
            System.out.println("No. of times maximum number repeat:"+count2);
        }
   
   
}
