import java.util.*;
class Faulty_KeyBoard
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='i')
           {
               sb.reverse();
           }
           else
           {
               sb.append(s.charAt(i));
           }
        }
        String s2=String.valueOf(sb);
        System.out.println(s2);
    }
}
// Input:String
// O/p-rtsng
// Input:poiinter
// o/p-ponter;