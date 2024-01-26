import java.util.*;
class Nuclear_Energy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int intial=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        int total_energy=intial;
        int sum=intial;
        for(int i=2;i<=time;i++)
        {
            total_energy=total_energy+rate;
            sum=sum+total_energy;
        }
        System.out.println(sum);
       
        
    }
}