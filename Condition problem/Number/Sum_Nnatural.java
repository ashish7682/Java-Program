import java.util.Scanner;
class Sum_Nnatural
{
    public static void main(String args[])
    {
        int i,n,sum=0;
        System.out.print("Enter your choice:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.print("result= "+sum);
    }
}