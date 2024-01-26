import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
       int col=sc.nextInt();
       int a[][]=new int[row][col];
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               a[i][j]=sc.nextInt();
           }
       }
       int count,max=0,index=0;
       for(int i=0;i<row;i++)
       {
           count=0;
           for(int j=0;j<col;j++)
           {
               if(a[i][j]==1)
               {
                   count++;
               }
           }
           if(count>max)
           {
               max=count;
               index=i+1;
           }
       }
       System.out.println(index);
    }
}