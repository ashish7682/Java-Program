import java.util.*;
class StringTwist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextLine();
        }
        String res1="";
        for(int i=0;i<a[0].length();i++)
        {
            String s1=a[0];
            if(s1.charAt(i)=='A' ||s1.charAt(i)=='E'||s1.charAt(i)=='I' ||s1.charAt(i)=='O'||s1.charAt(i)=='U'
            || s1.charAt(i)=='a' ||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
            {
              res1=res1+"%";
            }else
            {
                res1=res1+s1.charAt(i);
            }
            
        }
        String res2="";
        for(int i=0;i<a[1].length();i++)
        {
            String s1=a[1];
            String consonant="bcdfghjklmnpqrstvwxyz";
            String check=Character.toString(s1.charAt(i));
            if(consonant.contains(check))
            {
                res2=res2+"#";
            }else
            {
                res2=res2+check;
            }
            
        }

       
        String res3=a[2].toUpperCase();
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);  


    }
}