import java.util.*;
class MaximumNumberOfOneRow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int rowindex=0;
        for(int i=0;i<r;i++)
        {
            int count=0;
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                rowindex=i+1;
            }
        }
        System.out.print(rowindex);
    }
}