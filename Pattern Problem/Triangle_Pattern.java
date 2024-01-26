import java.util.Scanner;
class Triangle_Pattern
{
    public static void main(String args[])
    {
        int n,i,j,r;
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter number of Rows:");;
        n=ref.nextInt();
        for(i=1;i<=n;i++)
        {
            for(r=1;r<=n-i;r++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}