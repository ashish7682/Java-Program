import java.util.*;
import java.math.*;
class CyclicBusStop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine().toUpperCase();
        String et=sc.nextLine().toUpperCase();
        String stop[]={"TH","GA","IC","HA","TE","LU","NI","CA"};
        int path[]={800,600,750,900,1400,1200,1100,1500};
        int x=0,y=0;
        for(int i=0;i<stop.length;i++)
        {
            if(st.equals(et))
            {
                System.out.println("INVALID INPUT");
                break;
            }
            if(stop[i].equals(st))
            {
               x=i;
            }
            if(stop[i].equals(et))
            {
                y=i;
            }
        }
    
        int totalPath1=0;
        int totalPath2=0;
        int totalPath=0;
        if(x>y)
        {
           for(int i=x+1;i<8;i++)
           {
              totalPath1=totalPath+path[i];
           }
           for(int i=0;i<=y;i++)
           {
            totalPath2=totalPath2+path[i];
           }
           totalPath=totalPath1+totalPath2;
        //    System.out.println(totalPath);

        }else
        {
            for(int i=x+1;i<=y;i++)
            {
              totalPath=totalPath+path[i];
            }
        }
        double cost=0.005*totalPath;
        double res=Math.ceil(cost);
        System.out.println(res);
       
        
    }
}