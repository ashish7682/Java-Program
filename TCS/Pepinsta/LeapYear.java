import java.util.*;
class LeapYear
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0&&n%100!=0 ||n%400==0)
        {
            System.out.println(n+" is a Leap Year");
        }else
        {
            System.out.println(n+" is not a Leap Year");
        }
    }
}

// Input:2000
// o/p-LeapYear
// Input:1900
// o/p-Not LeapYear