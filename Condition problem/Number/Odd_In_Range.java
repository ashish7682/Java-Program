import java.util.Scanner;
class Odd_In_Range
{
    public static void main(String args[])
    {
        int n,i;
        System.out.print("enter the highest no.=");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        for(i=1;i<=n;i++)
        {
        if(i%2==0)
        {
        System.out.println(""+i);
        }
        }
    }
}