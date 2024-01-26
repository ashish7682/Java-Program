import java.util.*;
class TechNumber
{
    public static void main (String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int temp=n;
       String s=Integer.toString(n);
       int sum=0;
       for(int i=0;i<s.length();i=i+2)
       {
           String s1=s.substring(i,i+2);
           int num=Integer.parseInt(s1);
           sum=sum+num;
       }
    //   System.out.println(sum);
        int square=(int)Math.pow(sum,2);
        if(square==temp)
        {
            System.out.println("It is a tech no");
        }
        else
        {
            System.out.println("It is not a tech no");
        }
    }
}