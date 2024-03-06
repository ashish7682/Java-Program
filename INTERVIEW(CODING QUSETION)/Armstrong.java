import java.util.*;
class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp1=num;
        int temp2=num;
        int digit=0;
        while(temp1!=0)
        {
            temp1=temp1/10;
            digit++;
        }
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum=sum+(int)Math.pow(rem,digit);
            num=num/10;
            
        }
        if(sum==temp2)
        {
            System.out.println("Armstrong");
        }else
        {
            System.out.println("Not Armstrong");
        }
        
    }
}