import java.util.*;
class TCS1
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        
        for(int i=0;i<n;i++)
          {
               for(int j=0;j<n;j++)
               {
                   a[i][j]=sc.nextInt();
               }
          }
          int suml=0;
          int sumr=0;
          int i=0;
          int j=0;
       while(i!=n && j!=n)
       {
           suml=suml+a[i][j];
           i++;
           j++;
       }
        i=0;
        j=n-1;
        while(i!=n && j>=0)
       {
           sumr=sumr+a[i][j];
           i++;
           j--;
       }
      int result= Math.abs(suml-sumr);
      System.out.println(result);
    }
}