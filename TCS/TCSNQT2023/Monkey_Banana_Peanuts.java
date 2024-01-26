import java.util.*;
class Monkey_Banana_Peanuts
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int j=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
     
        int leftMonkey=n-((m/k)+(p/j));
        System.out.println(leftMonkey);
    }
}