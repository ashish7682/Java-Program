import java.util.*;
class Network_Marketing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int person=sc.nextInt();
        int profit=sc.nextInt();
        int percent=sc.nextInt();
        int res=0;
        while(person!=1)
        {
            res=(profit*percent)/100;
            profit=res;
            person--;
        }
        System.out.println(res);
    }
}