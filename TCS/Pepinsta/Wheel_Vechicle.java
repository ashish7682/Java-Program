import java.util.*;
class Wheel_Vechicle
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int v=sc.nextInt();
      int w=sc.nextInt();
      int x=(w/2)-v;
      int y=v-x;
      System.out.println(x);
      System.out.println(y);
    }

}