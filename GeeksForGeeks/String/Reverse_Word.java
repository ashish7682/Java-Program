import java.util.*;
class Reverse_Word
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        
        String s1="";
        
        for(int i=a.length-1;i>=0;i--)
        {
            s1=s1+a[i]+" ";
        }
        
        String res=s1.trim();
        System.out.println(res);
    }
}