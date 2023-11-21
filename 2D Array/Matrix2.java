import java.util.Scanner;
class Matrix2
{
    public static void main(String args[])
    {
        int n,m;
        System.out.print("Enter number of rows:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        System.out.print("Enter number of columns:");
        m=ref.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=ref.nextInt();
            }
        }
        System.out.println("Number Represent in Matrix Format:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        

    }
}