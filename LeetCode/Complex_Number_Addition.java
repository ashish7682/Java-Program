import java.util.*;
class Complex_Number_Addition
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        String x[]=s1.split("\\+|i");
        String y[]=s2.split("\\+|i");
        
        int s1_real=Integer.parseInt(x[0]);
        int s1_img=Integer.parseInt(x[1]);
        
        int s2_real=Integer.parseInt(y[0]);
        int s2_img=Integer.parseInt(y[1]);
        
        String res=(s1_real * s2_real - s1_img*s2_img) + "+" + "i" + (s1_real * s2_img +s2_real * s1_img);
        
        System.out.println(res);
    }
}