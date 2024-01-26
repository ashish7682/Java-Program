import java.util.Scanner;
class PerfectNumber
{
public static void main(String args[])
{
    int n,sum=0,tem;
    System.out.print("Enter a number:");
    Scanner ref=new Scanner(System.in);
    n=ref.nextInt();
    
    tem=n;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
}
if(sum==tem)
{
    System.out.print("It is a perfect Number");
}else{
    System.out.print("It is not a perfect Number.");
}
}
}