import java.util.*;
class ChainMarketing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String parent=sc.nextLine();
        String ch=sc.nextLine();
        String child=sc.nextLine();
        // System.out.println(chi);
        String a[]=child.split(" ");
        if(ch=="N")
        {
          System.out.println("TOTAL MEMBER: 1");
          System.out.println("COMMISSION DETAILS:");
          int com1=(int)(5000*(0.10)*a.length);
          System.out.println(parent+": "+com1+" INR");
          
           
        }
        // else if(ch=="Y")
        else
        {
            System.out.println("TOTAL MEMBER: "+a.length);
            System.out.println("COMMISSION DETAILS:");
            int com1=(int)(5000*(0.10)*a.length);
             System.out.println(parent+": "+com1+" INR");
             
            for(int i=0;i<a.length;i++)
          {
              System.out.println(a[i]+": 250 INR ");
          }
            
        }
    }
}

// Input:
// Amit
// Y
// Aakas Rajesh
// O/P-TOTAL MEMBER: 2
// COMMISSION DETAILS:
// Amit: 1000 INR
// Aakas: 250 INR 
// Rajesh: 250 INR 
