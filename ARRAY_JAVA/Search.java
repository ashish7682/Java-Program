                       //SEARCH BINARY NUMBER IN AN ARRAY//
import java.util.Scanner;
class  Search
{
    public static void main(String args[])
    {
        int n,i,count=0,q;
        System.out.print("Enter No. of term:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
         System.out.print("Enter Array Element:");
        int arr[]=new int[n];
        for( i=0;i<=n-1;i++)
        {
            arr[i]=ref.nextInt();
        }
        System.out.print("Array Element:");
        for( i=0;i<=n-1;i++)
        {
        System.out.println(" "+arr[i]);
        }
          System.out.print("Enter Search Element:");
          q=ref.nextInt();
       for(i=0;i<=n-1;i++)
        {
            if(arr[i]==q)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.print("Item found "+count+" number of times");
        }else{
            System.out.print("Item not found");
        }
    }
}