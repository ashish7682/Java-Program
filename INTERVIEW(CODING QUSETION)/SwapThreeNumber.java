import java.util.*;
class SwapThreeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        x=x+y+z;
        y=x-(y+z);
        z=x-(y+z);
        x=x-(y+z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}