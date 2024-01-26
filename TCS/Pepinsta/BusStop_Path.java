import java.util.*;
class BusStop_Path
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String stop[]={"TH","GA","IC","HA","TE","LU","NI","CA"};
        int path[]={800,600,750,900,1400,1200,1100,1500};
        String s=sc.next().toUpperCase();
        String d=sc.next().toUpperCase();
        int st=0,ed=0;
        int res=0;
        for(int i=0;i<8;i++)
        {
            if(s.equals(stop[i]))
            {
                st=i;
            }
            if(d.equals(stop[i]))
            {
                ed=i;
            }
        }
        
        if(st==ed)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int i=st+1;
            while(i!=ed+1)
            {
              res=res+path[i];
              i=(i+1)%8;
            }
            int result=(int)Math.ceil(res*0.005);
            System.out.println(result);
        }
        
    }
}