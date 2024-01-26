import java.util.*;
class Turncate_Sentence
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String a[]=s.split(" ");
        String s1="";
        for(int i=0;i<k;i++)
        {
            s1=s1+a[i]+" ";
        }
        String res=s1.trim();
        System.out.println(res);
    }
}