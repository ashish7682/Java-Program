import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int n1,n2,i,j;
        System.out.print("Enter starting range:");
        Scanner ref=new Scanner(System.in);
        n1=ref.nextInt();
        System.out.print("Enter ending range:");
        n2=ref.nextInt();
        for(i=n1;i<=n2;i++)
        {
          for(j=2;j<i;j++)
          {
            if(i%j==0)
            break;   
          }  
          
        if(i==j)
        {
        System.out.println(j);
        }
        }
    }

}