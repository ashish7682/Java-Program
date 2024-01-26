import java.util.*;
class ArmStrong
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tem=n;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,3);
            n=n/10;
        }
        // System.out.println(sum);
        if(sum==tem)
        {
            System.out.println("ArmStrong");
        }
        else
        {
          System.out.println("Not ArmStrong");   
        }
    }
}