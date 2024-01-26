import java.util.*;
class Encrypt_Decrypt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=new char[s.length()];
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int  ascii=(int)c;
            int add=c+3;
        
            if(add>122)
            {
                add=add-26;
            }
            char c1=(char)add;
            ch[i]=c1;
            res=res+ch[i];
        }
        // for(int i=0;i<ch.length;i++)
        // {
        //     res=res+ch[i];
        // }
        System.out.println(res);
    }
}