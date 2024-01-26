import java.util.Scanner;
class  Nnumber
{
    public static void main(String args[])
    {
        int i,n;
        System.out.print("Enter no of terms:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        for(i=0;i<=n;i++)
        {
            System.out.println(""+i);
        }
    }
}