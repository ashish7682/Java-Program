import java.util.*;
class TextEncryptedDecrypted
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                res=res+' ';
            }else
            {
            int k=s.charAt(i);
            int r=k+n;
            if(r>122 || (k<90 && r>90))
            {
                r=r-26;
            }
            char character=(char)r;
            res=res+character;
            }
        }
        System.out.println(res);
    }

}