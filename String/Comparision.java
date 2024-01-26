// class Comparision
// {
//     public static void main(String args[])
//     {
//         String a="Lion";//.....literal
//         String b=new String("Lion");//....new keyword
//         //String b="Lion";//....literal
//         if(a==b)
//         {
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
//         //....another way to compare two string...
//         if(a.equals(b))
//         {
//             System.out.println("true");
//         } else{
//             System.out.println("false");
//         }

//     }
// }
/*package whatever //do not write package name here */
import java.util.*;
class Comparision
{
    public static void main(String args[])
    {
        String s="Ashish";
        String s1=s;
       System.out.println(s1+" "+s);
        s="Biswa";
        System.out.println(s1+" "+s);
    }
}