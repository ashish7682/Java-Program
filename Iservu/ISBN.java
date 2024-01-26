import java.util.*;
class ISBN
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int j=1;
        int sum=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            sum=sum+(s.charAt(i)-'0')*j;
            j++;
        }
        if(sum%11==0)
        {
            System.out.println("It is a ISBN");
        }
        else
        {
            System.out.println("It is not ISBN");
        }
        
    }
}