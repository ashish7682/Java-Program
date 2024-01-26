import java.util.*;
class ChainMarketing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String parent=sc.nextLine();
        String ch=sc.nextLine();
        String child=sc.nextLine();
        String a[]=child.split(" ");
        if(ch.equals("N"))
        {
            System.out.println("Total Member: 1");
            System.out.println("COMISSION DETAILS");
            int com1=(int)(5000 * 0.10) * a.length;
            System.out.println(parent+" :"+com1+" INR");
        }else if(ch.equals("Y"))
        {
            System.out.println("Total Member: "+a.length);
            System.out.println("COMISSION DETAILS");
            int com1=(int)(5000 * 0.10) * a.length;
            System.out.println(parent+" :"+com1+" INR");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]+": 250 INR");
            }

        }
    }
}