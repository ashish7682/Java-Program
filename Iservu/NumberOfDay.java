import java.util.*;
class NumberOfDay
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String arr[]=s.split("-");
        
        
        int k=Integer.parseInt(arr[1]);
    
        int month=0;
        for(int i=0;i<k-1;i++)
        {
            month=month+a[i];
        }
        
        
        int day=Integer.parseInt(arr[2]);
        
        int total=month+day;
        
        System.out.println(total);
        
    }
}