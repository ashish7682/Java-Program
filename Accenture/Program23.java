import java.util.*;
class Program23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split(" ");
        String s1="";
        for(int i=a.length-1;i>=0;i--)
        {
            s1=s1+a[i];
            if(i!=0)
            {
                s1=s1+" ";
            }
        }
        System.out.println(s1);

    }
}