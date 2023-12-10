import java.util.*;
class Reverse_Num
{
    public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int reverse=0;
       while(num!=0)
       {
           int rem=num%10;
           reverse=reverse*10+rem;
           num=num/10;
       }
       System.out.println(reverse);
   }
}