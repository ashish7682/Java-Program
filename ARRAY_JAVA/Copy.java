                // COPY OF ONE ARRAY ELEMENT TO ANOTHER ARRAY ELEMENT// 
import java.util.Scanner;
class Copy
{
    public static void main(String args[])
    {
    int n,i;
    System.out.print("Enter no. of term:");
    Scanner ref=new Scanner(System.in);
    n=ref.nextInt();
    int a[]= new int[n];
    int b[]=new int[n];
    for(i=0;i<=n-1;i++)
    {
        a[i]=ref.nextInt();
        
    }
    System.out.println("Enter Element of first array:");
    for(i=0;i<=n-1;i++)
    {
        System.out.println("a["+i+"]="+a[i]);
    }
    System.out.println("Enter Element of Second Array:");
    for(i=0;i<=n-1;i++)
    {
        b[i]=a[i];
        System.out.println("b["+i+"]="+b[i]);
    }

    }
}