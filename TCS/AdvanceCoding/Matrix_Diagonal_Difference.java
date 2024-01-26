import java.util.*;
class Matrix_Diagonal_Difference
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int sum1=0;
        int sum2=0;
        int k=0;
        int l=a.length-1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(i==j)
                {
                    sum1=sum1+a[i][j];
                }
                if(i==k && j==l)
                {
                    sum2=sum2+a[i][j];
                    k++;
                    l--;
                }
            }
        }
        // System.out.println(sum1);
        // System.out.println(sum2);
        int result=Math.abs(sum1-sum2);
        System.out.println(result);
    }
}