import java.util.*;
class PM_President_Metting
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=1;
    for(int i=1;i<n;i++)
    {
        fact=fact*i;
    }
    int result=fact*2;
    System.out.println(result);
    }

}