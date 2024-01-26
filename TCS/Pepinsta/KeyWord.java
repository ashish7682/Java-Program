import java.util.*;
class KeyWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]={"break", "case", "continue", "default", "defer", "else", "for",
        "func","goto","if","map","range","return", "struct", "type", "var"};
        int flag=0;
        for(int i=0;i<str.length;i++)
        {
           if(str[i].equals(s))
           {
               flag=1;
               break;
           }
        }

           if(flag==1)
            {
                System.out.println(s+" is a keyword");
              
            }
            else
            {
                System.out.println(s+" is a not a keyword");
               
            }
    }
}