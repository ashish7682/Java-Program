import java.util.*;
class DeleteString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String res="";
        for(int i=0;i<s1.length();i++)
        {
            String s=Character.toString(s1.charAt(i));
            if(!s2.contains(s))
            {
               res=res+s;
            }
          
        }
        System.out.println(res);
    }
}