import java.util.*;
class ToggleBit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String binary=Integer.toBinaryString(n);
        String res="";
        for(int i=0;i<binary.length();i++)
        {
            if(binary.charAt(i)=='1')
            {
                res=res+"0";
            }else if(binary.charAt(i)=='0')
            {
                res=res+"1";
            }
        }
        
        int decimal=Integer.parseInt(res,2);
        System.out.println(decimal);
        
    
    }
}