import java.util.Scanner;
class Second
{
    public static void main(String args[])
    {
        int n,i;
        
        System.out.print("Enter number of term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=ref.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}