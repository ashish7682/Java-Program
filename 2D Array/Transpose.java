import java.util.Scanner;
class Transpose
{
    public static void main(String args[])
    {
        int m,n;
        System.out.print("Enter number rows:");
        Scanner ref=new Scanner(System.in);
        m=ref.nextInt();
        System.out.print("Enter number Column:");
        n=ref.nextInt();
        int arr[][]=new int[m][n];
        System.out.print("Enter matrix Element:");
        //Enter Number of rows
        for(int i=0;i<m;i++)
        {
            //Enter Number of columns 
            for(int j=0;j<n;j++)
            {
                arr[i][j]=ref.nextInt();
            }
        }
        System.out.println("Matrix Element:")
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }
        

    }
}
