import java.util.*;
class TCS3
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int i=0;
        while(i<n-1)
        {
             m=(m*p)/100;
            i++;
            
        }
        System.out.println(m);
        
    }
}