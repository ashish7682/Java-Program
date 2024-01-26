import java.util.Scanner;
class Sorting
{
    public static void main(String args[])
    {
        int n,temp;
        System.out.print("Enter no. of term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int num[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
         num[i]=ref.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(num[i]>num[j])
                {
                   temp=num[i];
                   num[i]=num[j];
                   num[j]=temp; 
                }
            }
        } 
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("num["+i+"]="+num[i]);
        }
    }
}