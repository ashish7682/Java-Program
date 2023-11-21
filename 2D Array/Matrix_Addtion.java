import java.util.Scanner;
class Matrix_Addtion
{
    public static void main(String args[])
    {
    int m,n;
    System.out.print("Enter number rows:");
    Scanner ref=new Scanner(System.in);
    m=ref.nextInt();
    System.out.print("Enter Number of columns:");
    n=ref.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    int c[][]=new int[m][n];
    System.out.println("Enter Number in First Matrix:");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=ref.nextInt();
        }
    }
    System.out.println("Enter Number in Second Matrix:");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            b[i][j]=ref.nextInt();
        }
    }
    System.out.println("First Matrix Elements:");
     for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.println(a[i][j]+"\t");
        }
    }
    System.out.println("Second Matrix Element:");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.println(b[i][j]+"\t");
        }
    }
    System.out.println("Matrix Addition:");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
         c[i][j]=a[i][j]+b[i][j];
         System.out.print(c[i][j]+" ");
        }
    System.out.println();
    }
    

}
}