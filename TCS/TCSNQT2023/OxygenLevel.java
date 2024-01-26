import java.util.*;
class OxygenLevel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int a[]=new int[9];
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        int avg1=(a[0]+a[3]+a[5])/3;
        int avg2=(a[1]+a[4]+a[6])/3;
        int avg3=(a[2]+a[5]+a[7])/3;
        int max=avg1;
        int result=Math.max(avg1,avg2);
        int res2=Math.max(result,avg3);
        if(res2==avg1)
        {
            System.out.println("Trainee Number:1");
        } if(res2==avg2)
        {
             System.out.println("Trainee Number:2");
        } if(res2==avg3)
        {
             System.out.println("Trainee Number:3");
        }

    }
}