import java.util.Scanner;
class Pattern2
{
    public static void main(String args[])
    {
        int i,j,n,m;
        System.out.print("Enter No. of rows:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        System.out.print("Enter No. of columns:");
        m=ref.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}