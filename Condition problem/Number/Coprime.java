import java.util.*;
class Coprime
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        for(int i=1;i<=n1 && i<=n2;i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("Co-prime");
        }
        else
        {
            System.out.println("Not Co-prime");
        }
    }
}