import java.util.*;
class NumberOfSenior
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String details[]=new String[n];
    int count=0;
    for(int i=0;i<n;i++)
    {
        details[i]=sc.nextLine();
    }
    for(int i=0;i<details.length;i++)
    {
        String s1=details[i];
        // if(s1.charAt(12)=='6'||s1.charAt(12)=='7'||s1.charAt(12)=='8'||s1.charAt(12)=='9')
        // {
        //     count++;
        // }
        System.out.println(s1);
    }
    // System.out.println(count);
 }
}